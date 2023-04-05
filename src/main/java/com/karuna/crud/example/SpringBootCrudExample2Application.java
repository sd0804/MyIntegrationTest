package com.karuna.crud.example;

import com.karuna.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootCrudExample2Application {

    @Autowired
    private ProductRepository repository;

    @PostConstruct
    public void init() {
//        repository.saveAll(
//                Stream
//                        .of(
//                                new Product("Book", 1, 299),
//                                new Product("mobile", 1, 39999))
//                        .collect(Collectors.toList())
//        );
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudExample2Application.class, args);
    }

}
