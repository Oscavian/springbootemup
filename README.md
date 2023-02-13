# SpringBoot'em'up
Test project to learn SpringBoot.

## Database Setup
```bash
$ docker run --detach --name springdb -e POSTGRES_PASSWORD=123456 -p 5432:5432 postgres

$ docker exec test psql -U postgres -c 'create database springdb'
```