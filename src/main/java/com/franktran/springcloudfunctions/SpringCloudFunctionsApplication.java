package com.franktran.springcloudfunctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionsApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudFunctionsApplication.class, args);
  }

  @Bean
  public Function<String, String> toUpperCase() {
    return String::toUpperCase;
  }

  @Bean
  public Supplier<String> getMessage() {
    return () -> "Welcome to Spring Cloud Function";
  }

  @Bean
  public Consumer<String> printMessage() {
    return System.out::println;
  }
}
