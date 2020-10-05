# dropwizard-rest-pagination
Simple example of paginated RESTful API using Dropwizard and Mongo DB.

# Running the project 

* Clone the project: 

`git clone https://github.com/NabilCC/dropwizard-rest-pagination.git`

* CD to the directory:

`cd dropwizard-rest-pagination`

* Build the project:

`./gradlew clean shadowJar`

* Run the application:

`java -jar build/libs/application.jar server ./src/main/resources/app-config.yml`

* By default, retrieve the first page of 10 entities:

`curl http://localhost:7070/customers`

* Retrieve the 2nd page:

`curl http://localhost:7070/customers?page=1`

* Retrieve the first page of 20 entities:

`curl http://localhost:7070/customers?size=20`

* Retrieve the 2nd page of 20 entities:

`curl "http://localhost:7070/customers?page=1&size=20"`
