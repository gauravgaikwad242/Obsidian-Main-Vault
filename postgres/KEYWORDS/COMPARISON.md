
- TO COMPARE VALUES
```
SELECT 1 = 1;
 ?column?
----------
 t
(1 row)


SELECT 1 = 2;
 ?column?
----------
 f
(1 row)
```
- GREATER THAN LESS THAN
```
test=# SELECT 1 < 2;
 ?column?
----------
 t
(1 row)


test=# SELECT 1 <= 2;
 ?column?
----------
 t
(1 row)


SELECT 1 <= 1;
 ?column?
----------
 t
(1 row)


SELECT 1 < 1;
 ?column?
----------
 f
(1 row)

```

- NOT EQUAL


```

SELECT 1 <> 1;
 ?column?
----------
 f
(1 row)


SELECT 1 <> 2;
 ?column?
----------
 t
(1 row)
```