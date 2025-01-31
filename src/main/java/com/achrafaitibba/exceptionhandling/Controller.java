package com.achrafaitibba.exceptionhandling;

import com.achrafaitibba.exceptionhandling.exception.RequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/{id}")
    public String hello(@PathVariable Long id) {
        if (id % 2 == 0) {
            throw new RequestException("Your exception description", HttpStatus.NOT_FOUND);
            /** Sample response
             * {
             * "message":"Your exception description",
             * "httpStatus":"NOT_FOUND",
             * "httpStatusNumber":404,
             * "timestamp":"2025-01-31T10:06:13.736977729Z"}
             */
        }
        return "hello";
    }
}
