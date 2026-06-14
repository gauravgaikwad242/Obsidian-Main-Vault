- We need threads for 
	- performance and 
	- Responsiveness

## Operating System Fundamentals 
#### Concurrency - Multitasking 
- computer creates illusion that all task at running at one time 
- we can achieve multitasking or concurrency on single core
- ![[Pasted image 20260614144624.png]]

#### Multithreading Caveat 
- learning curve as it is different than single threaded programming 

#### Operating System 
- stored on disc , when we start computer it gets loaded on memory 
- OS helps users and developer to interact with hardware and CPU

#### Process 
- a software is stored in disc in form of file same as other text files 
- when we run this software the OS creates its instance in Memory (RAM), It is called PROCESS or Context of Application 
![[Pasted image 20260614145024.png]]

##### Process Contains 
1. PID = metadata of process 
2. Files = of software 
3. Code = instruction to be performed 
4. Data (Heap) = Memory required by software 
5. Thread or Threads = with stack and instruction pointer 
	1. Stack = where local variables are stored and passed into functions 
	2. instruction Pointer = address of the next instruction to execute 
![[Pasted image 20260614145509.png]]


### Context Switch 
1. Each pc has multiple applications running i.e. processes 
2. each process has one or multiple threads running 
3. So the core or cores of the CPU needs to choose which thread to run and stop 
4. this process of starting stopping and scheduling threads is called `Context Switch`
5. ![[Pasted image 20260614150359.png]]

#### Thrashing 
- having too many threads cause thrashing. that means instead of running tasks OS spends more time in managing threads  

- Threads need less resources than Process 
- context switching between 2 threads in same Process is cheaper than context switching between 2 threads between different process 

#### Thread scheduling 
- if a long thread is scheduled by core to run then it will block other threads for too long - this is called starvation 
- it makes application unresponsive
- ![[Pasted image 20260614151008.png]]

- operating system divides the time in moderately sized intervals called ***epochs*** 
- each thread will have priority calculated dynamically 
- ![[Pasted image 20260614151308.png]]

```
dynamic priority = static priority + bonus 
```

preference to threads such as UI interactive thread 

### when to prefer multithreaded Architecture
1. tasks share a lot of data 
2. threads are much faster to create and destroy 
3. switching between threads is faster than process 
### when to prefer multi-process Architecture
1. security and stability is imp. 
2. task are unrelated 
3. 