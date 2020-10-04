package net.nh.setup;

import lombok.extern.slf4j.Slf4j;
import net.nh.entity.Customer;
import net.nh.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DataSetup {

    private final CustomerRepository repository;
    private long customerIdSequence;

    public DataSetup(CustomerRepository repository) {
        this.repository = repository;
    }

    public void init() {
        repository.deleteAll();

        log.info("Initialising Mongo data");

        List<Customer> toCreate = new ArrayList<>(50);

        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Joel Ward").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Netherlands").name("Patrick van Aanholt").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Serbia").name("Luka Milivojević").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("James Tomkins").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Scott Dann").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Germany").name("Max Meyer").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Senegal").name("Cheikhou Kouyaté").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Ghana").name("Jordan Ayew").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Andros Townsend").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Ivory Coast").name("Wilfried Zaha").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("France").name("Mamadou Sakho").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Wales").name("Wayne Hennessey").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Ghana").name("Jeffrey Schlupp").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Scotland").name("James McArthur").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Republic of Ireland").name("Stephen Henderson").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Belgium").name("Christian Benteke").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Connor Wickham").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Republic of Ireland").name("James McCarthy").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Belgium").name("Michy Batshuayi").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Gary Cahill").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Eberechi Eze").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Tyrick Mitchell").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Spain").name("Vicente Guaita").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Poland").name("Jarosław Jach").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Martin Kelly").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Sam Woods").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Nathan Ferguson").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Nya Kirby").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Brandon Pierrick").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Nertherlands").name("Jaïro Riedewald").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Luke Dreher").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Croatia").name("Nikola Tavares").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Italy").name("Giovanni McGregor").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Ghana").name("Malachi Boateng").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Ryan Inniss").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Jake Giddings").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Scotland").name("Oliver Webber").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Lewis Bryon").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Reece Hannam").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Lewis Hobbs").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Jacob Mensah").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Australia").name("Jay Rich Baghuelou").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("Scott Banks").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("England").name("David Boateng").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Spain").name("Iker Ramos").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Germany").name("Jerome Goetze").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Ireland").name("Callum Lainey").build());
        toCreate.add(Customer.builder().id(++customerIdSequence).country("Portugal").name("Niko Fernandes").build());

        repository.saveAll(toCreate);
    }

}
