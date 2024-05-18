1. create custom class for extension 
2. and throw it in the controller 
3. that exception can be handled in a class with @RestControllerAdvice
4. create method and pass custom exception as parameter 
5. annotate method with @ExceptionHandler({customexception.class, customexception1.class})
6. annotate the method with @ResponseStatus(HttpStatus.BadRequest)

```java 
package com.domain.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler({CustomException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public SomeDto handlerException(CustomException exception) {
        return someDto(with message, status code etc)
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
```