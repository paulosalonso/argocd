package com.github.paulosalonso.kind;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

  @GetMapping
  public DTO helloWorld() {
    return DTO.builder()
        .message("Hello World V1!")
        .status("HEALTHY")
        .build();
  }

  @Builder
  @Getter
  public static class DTO {
    private String message;
    private String status;
  }
}
