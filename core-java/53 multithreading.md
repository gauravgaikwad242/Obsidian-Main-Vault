#### Multi-Tasking 
Performing multiple task simultaneously at the same time by a single processor in order to optimize the utilization of cpu

| . | Multitasking | . |
| ---- | ---- | ---- |
| Process based multitasking |  | Thread based multitasking |
| multi processing |  | multi threading |
- context switching is easy in multi threading
- Process is program 
![[Pasted image 20240124081941.png]]
#### what is a thread ?
1. a process is smallest unit of process 
2. process acts as a host for thread 
3. At least one process is required for 
4. thread share same ADDRESS LOCATION 
5. as threads share same address location CONTEXT SWITCHING is easy in threads

#### How to create a thread? 
A) we can create a thread in two ways ( both are in java.lang package so no import)
1. by ***extending thread*** class 
2. by ***implementing runnable*** interface 

NOTE: 
#### whenever we are starting a thread with the help of start() every thread by default will execute run() 
