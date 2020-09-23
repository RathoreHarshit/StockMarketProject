package com.harshit.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserControllerExceptionHandler {
@ExceptionHandler
  public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException unfe)
  {

      UserErrorResponse userErrorResponse= new UserErrorResponse( unfe.getMessage(),HttpStatus.NOT_FOUND.value(),System.currentTimeMillis());
      return new ResponseEntity<UserErrorResponse>(userErrorResponse,HttpStatus.NOT_FOUND);
  }
}
