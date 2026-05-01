
# 72 Introduction 
- main building blocks 
- advertised as **infinite scaling** storage 
- other services use s3 as integration 

### use case 
- Backup and storage 
- disaster recovery 
- Archiving files - cheaper 
- hybrid cloud storage 
- Application hosting 
- media hosting 
- data lakes and big data analytics 
- software delivery 
- static website 

### S3 Buckets 
- objects (files) stored in `buckets` (directories) 
- Defined at region level 
- S3 is global service but buckets are created in region 

### Naming of Buckets 
- `shared global namespace` - globally unique name 
- `Account regional namespace` - allows to reuse bucket name across all region 

### Naming Constraint 
![[Pasted image 20260501193338.png]]

### S3 Objects 
- objects have a key 
- ![[Pasted image 20260501194732.png]]
- Max object size is 50 TB 
- if uploading file more than 5GB , we must use multipart upload

# 73 Hands-on 

1. select region 
2. select General Purpose - common 
3. namespace - Global Namespaces
4. enter unique bucket name 
5. or 3-4 -> user account regional namespace where s3 will create unique name 
6. object ownership - ACLs disabled recommended 
7. block all public access 
8. disable versioning 
9. default encryption - SSE - s3 
10. Create Bucket 
11. go to S3 -> buckets : here all the buckets are listed 
12. open created bucket 
13. upload required file 
14. s3://#bucketname#/directorylike/directorylike/object 
15. the uploaded object is not accessible to others even with URL 
16. in same browser where console is logged in , it will open as there is presigned url is opened 
17. go to bucket > create folder > foldername 

# 74 Bucket Policy 












