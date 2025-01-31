# Spring Boot Exception Handling Magic

Hey friends! Tired of writing repetitive error handling code? I've got a slick exception handling solution that'll save you tons of time and make your Spring Boot apps look beautiful hh and professional.

## What's This All About?

This is a custom exception handling framework that:
- Standardizes error responses
- Provides consistent error tracking

## Key Components

1. **`RequestException`**: A custom runtime exception that lets you throw meaningful errors with HTTP status codes
2. **`ApiException`**: A record that structures your error responses beautifully
3. **`AppExceptionHandler`**: Catches and transforms exceptions into clean, consistent responses

## Quick Example

```java
// Throwing a custom exception
throw new RequestException("User not found", HttpStatus.NOT_FOUND);
```

When this happens, you'll get a response like:
```json
{
  "message": "User not found",
  "httpStatus": "NOT_FOUND",
  "httpStatusNumber": 404,
  "timestamp": "2025-01-31T08:34:56Z"
}
```

## How to Use

1. Copy the whole exception package into your project
2. And voila hh go to the step number 3, there is not step 2 hh
3. Start throwing `RequestException` wherever you need custom error handling

## Pro Tips
- Customize error messages
- Add more exception types as needed
- Great for API development and microservices

---
> ⚠️ **Warning:** My code sucks, feel free to make a PR hh


## Links
[LinkedIn](https://www.linkedin.com/in/achrafaitibba)

[My Website](https://www.achrafaitibba.com)

[Twitter](https://www.twitter.com/achrafaitibba)