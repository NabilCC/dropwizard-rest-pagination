package net.nh;

import com.fasterxml.jackson.databind.MapperFeature;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import lombok.extern.slf4j.Slf4j;
import net.nh.repository.CustomerRepository;
import net.nh.route.CustomerRoute;
import net.nh.setup.DataSetup;

@Slf4j
public class DropwizardApplication extends Application<AppConfig> {

    public static void main(String[] args) throws Exception {
        new DropwizardApplication().run(args);
    }

    @Override
    public void run(AppConfig configuration, Environment environment) {
        log.info("Starting application");

        // Morphia/Mongo
        final Datastore datastore = Morphia.createDatastore(MongoClients.create(), configuration.getDbName());
        datastore.getMapper().mapPackage("net.nh.model");
        CustomerRepository repository = new CustomerRepository(datastore);
        DataSetup setup = new DataSetup(repository);
        setup.init();

        // Jersey
        environment.jersey().register(new CustomerRoute(repository));
    }
}
