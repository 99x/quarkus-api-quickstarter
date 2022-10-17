# Introduction

This project is a skeleton/ boilerplate project using Quarkus framework to expose a simple REST API 
connecting to a database

## Dependencies

The application has dependencies to the following

- postgresql
- keycloak

To initialize the dependecies you can run the bundled docker-compose file

```shell script
cd src/main/docker/
docker-compose up
```
This will start keycloak in port 8080 and postgresql in port 5433

## Running the application

```shell script
./gradlew quarkusDev
```
This will start the application in port 8082