- MATCHING DATA 
- WITH WILDCARDS (REGEX)

```
SELECT * 
FROM PERSON
WHERE EMAIL LIKE 'besherwoodad@apache.org';
```

- any email who end with .org
```
SELECT * 
FROM PERSON
WHERE EMAIL LIKE '%.org';
```

```
% IS LIKE * IN REGEX FOR MATCHING
```

```
SELECT * 
FROM PERSON
WHERE EMAIL LIKE '%@google.%';
```
