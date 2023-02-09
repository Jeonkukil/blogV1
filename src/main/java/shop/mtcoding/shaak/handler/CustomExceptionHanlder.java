package shop.mtcoding.shaak.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import shop.mtcoding.shaak.util.Script;
import shop.mtcoding.shaak.handler.ex.CustomException;

@RestControllerAdvice
public class CustomExceptionHanlder {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> customExcepton(CustomException e) {
        String responseBody = Script.back(e.getMessage());
        return new ResponseEntity<>(responseBody, e.getStatus());

    }

}
