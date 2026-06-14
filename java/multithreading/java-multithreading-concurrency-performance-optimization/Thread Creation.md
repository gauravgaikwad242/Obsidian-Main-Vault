### Creation

```java 
public class ThreadCreation {
public static void main(String[] args) {
    
    // we need to pass runnable class to thread class 
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            // the code here will run in separate thread
            System.out.println("currently in : "+ Thread.currentThread().getName());
            System.out.println("priority is : "+ Thread.currentThread().getPriority());

        }
    });

    // we need to manually call the thread to run 
        // methods in thread to class 
        Thread.currentThread().getName();
        //tells OS to not schedule the thread so this doesnt 
        //require any computational power 
        Thread.sleep(1000);

    // to give thread a name 
    thread.setName("New Worked Thread");
    //remember dynamic priority 
    thread.setPriority(Thread.MAX_PRIORITY);
    thread.start();
    
}
}
```

### Unchecked Exception Handler 

```java 
import javax.management.RuntimeErrorException;

public class ThreadUncheckedException {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeErrorException("Unexpecte Happened");
            }
        });

        thread.getUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("a critical error happened in thread : " + t.getName() + ": " + e.getMessage());
            }
        });
        thread.start();

    }

}

```

### Thread Creation with java.lang.Thread 

```java 
public class ThreadCreation {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}

class NewThread extends Thread {
    @Override
    public void run() {
        //code in new thread 
        System.out.println("running in new thread   ");
    }
}
```

### Case study to implement above