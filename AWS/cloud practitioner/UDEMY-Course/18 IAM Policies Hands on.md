
## to add permissions 
go to iam -> open user -> select add permission from dropdown -> we can add to group, copy and attach policies directly -> gave iam readonly policy -> with readonly access we cannot create group 


- create group -developers -> give permissions -> add user to group -> so in stefan user we will see 3 policies, from group developer , inline , group admin

# json for root user iam policies 

```json 
{
version: abc, 
statement : [
{
"effect": "Allow",
"Action": "*",
"Resources": "*"
}
]
}
```

## iamreadonlyaccess 
- in <mark style="background: #FF5582A6;">summary</mark> if we click on it we can see<mark style="background: #FF5582A6;"> api allowed </mark>

### we can also create a custom Policy 
