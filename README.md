This repository contains the source code for a simple phone book API application.

#About the project
The phonebook-api application provides a RESTful API for managing contacts. With this application, users can perform the following operations:

- Create a new contact
- Retrieve a list of all contacts
- Retrieve a specific contact
- Update an existing contact
- Delete an existing contact

The application is built using Java Spring Boot, which provides a robust and scalable framework for building RESTful APIs.

##Getting started
To run the phonebook-api application, you will need to have Java 11 or higher installed on your machine. Once Java is installed, you can follow these steps:

1. Clone the repository using the following command:

2. git clone [public repository]

3. Navigate to the project directory using the following command:
```sh
cd phonebook-api
```
4. Run the application using the following command:
```sh
./mvnw spring-boot:run
```

The application will start running on [localhost]. You can test the API endpoints using a tool like Postman.

##API documentation
The phonebook-api application provides the following endpoints:

```sh 
- GET /api/contacts - Retrieves a list of all contacts.
- GET /api/contacts/{id} - Retrieves a specific contact by ID.
- POST /api/contacts - Creates a new contact.
- PUT /api/contacts/{id} - Updates an existing contact by ID.
- DELETE /api/contacts/{id} - Deletes a specific contact by ID.
```

##Contributing
If you would like to contribute to the phonebook-api application, please follow these steps:

- Fork the [public repository] on GitHub.
- Clone your fork of the repository to your local machine.
- Create a new branch for your changes.
- Make your changes and commit them with a descriptive commit message.
- Push your changes to your fork of the repository.
- Submit a pull request to the main repository.
##License
The phonebook-api application is open source software released under the [GNU General Public License].

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

[localhost]:<http://localhost:8080>
[swagger]:<http://localhost:8080/swagger-ui.html>
[GNU General Public License]:<https://www.gnu.org/licenses/gpl-3.0.en.html>
[public repository]:<https://github.com/excellencia/phonebook-api>