
`\?` to list all the commands
`\q` to quit or exit database 
`\l` to list databases 

### to create database 

```Sql
CREATE DATABASE name_of_database; 
```

`;` to complete the query 

-------

### Connecting to database 

`psql --help` to list all the commands 

```sh
psql -h localhost -p <port:5432> -U <username:test? 

#to quit
\q 
```

#### if already authenticated in a database 

`\c <other_database_name>` 

#### To delete a database 
- <mark style="background: #FF5582A6;">dangerous command </mark>
```Sql
DROP DATABASE <test> 
```
