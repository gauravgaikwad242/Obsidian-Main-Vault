- where a column meets certain criterial
```
SELECT * FROM PERSON WHERE GENDER = 'Female';

SELECT * FROM PERSON WHERE GENDER = 'Female' AND COUNTRY_OF_BIRTH = 'Poland';
```

```
SELECT * FROM PERSON WHERE GENDER = 'Female' AND (COUNTRY_OF_BIRTH = 'Poland' OR COUNTRY_OF_BIRTH = 'India');
```



[[AND-OR]]
