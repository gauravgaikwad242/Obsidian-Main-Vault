- some aws services need to perform actions on your behalf 
- to do so we need to assign the permission to SERVICES 
- eg. EC2 instance need to access IAM role 
- lambda function role 
- role for cloud-formation 

go to 
1. iam 
2. roles 
3. create role 
4. select - aws service 
5. select - service to which we need role 
6. selected EC2 
7. attach policy next 
8. select iamreadonly access 
9. give role-name = ec2role 