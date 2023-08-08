
1. create table [create table]( ./TABLE_LIFECYCLE.md)

![[Pasted image 20230806204752.png]]

```
CREATE TABLE person(
id BIGSERIAL NOT NULL PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
gender VARCHAR(7) NOT NULL,
date_of_birth DATE NOT NULL,
email VARCHAR(150)
);
```

> BIGSERIAL -> auto increment