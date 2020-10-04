package net.nh.repository;

import dev.morphia.Datastore;
import dev.morphia.DeleteOptions;
import dev.morphia.query.FindOptions;
import net.nh.entity.Customer;
import net.nh.entity.Page;

import java.util.List;

import static dev.morphia.query.Sort.ascending;

public class CustomerRepository {

    private final Datastore datastore;

    public CustomerRepository(Datastore datastore) {
        this.datastore = datastore;
    }

    public Page<Customer> findAll(int pageNo, int pageSize) {
        long totalSize = datastore.find(Customer.class).count();
        long pageCount = totalSize / pageSize;
        if (totalSize % pageSize > 0) {
            pageCount++;
        }
        List<Customer> results = datastore.find(Customer.class)
                .iterator(new FindOptions().sort(ascending("name")).skip((pageNo * pageSize)).limit(pageSize))
                .toList();
        return new Page<>(pageNo, pageSize, pageCount, totalSize, results);
    }

    public void saveAll(List<Customer> customers) {
        datastore.save(customers);
    }

    public void deleteAll() {
        datastore.find(Customer.class).delete(new DeleteOptions().multi(true));
    }
}
