1. installation with docker
- easy 
- quick
- two ports are exposed 
- 15672 for admin management
- 5672 for api call
```sh
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
```

2. with choco package manager in windows
```sh
choco install rabbitmq
```
it will install erlang also

- we can check in services in winodow to see if the server is running