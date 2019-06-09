# rest-parakeet

```docker
docker-compose up -d
```

## Mongo

```docker
docker exec -it rest-parakeet_mongodb_1 bash
```

<https://stackoverflow.com/questions/42912755/how-to-create-a-db-for-mongodb-container-on-start-up/42917632#42917632>

```bash
mongo
# or
# mongo -u "user" -p "pass"
show dbs
use people
db.people.save({ firstname: "Tom", lastname: "Lalas" })
db.people.find({})
db.people.find({ firstname: "Tom"})
```

## Running the api in container

```bash
cd rest-parakeet-api
docker build -t rest-parakeet-api -f dockerfile.rest-parakeet.yml .
# Needs Mongodb to be running
docker run -d -p 8080:8080 --name rest-parakeet-api rest-parakeet-api
```

```
mvn clean
mvn package
docker-compose up -d --build
docker-compose down -v
```