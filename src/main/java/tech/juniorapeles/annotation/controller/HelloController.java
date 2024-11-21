package tech.juniorapeles.annotation.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.juniorapeles.annotation.log.Log;

@RestController
public class HelloController {

    @GetMapping
    @Log
    ResponseEntity<Void> hello() {
        System.out.println("No meio da execução");
        return ResponseEntity.ok().build();
    }
}
