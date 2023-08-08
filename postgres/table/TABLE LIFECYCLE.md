create table without contstraint
```
CREATE TABLE person(
id INT,
first_name VARCHAR(50),
last_name VARCHAR(50),
gender VARCHAR(7),
date_of_birth DATE
);
```

## To list the table
```
\d
```

```
         List of relations
 Schema |  Name  | Type  |  Owner
--------+--------+-------+----------
 public | person | table | postgres
```


## TO DELETE TABLE

```
DROP TABLE person;
```

## TO SEE TABLE DETAILS

```
\d person
```
