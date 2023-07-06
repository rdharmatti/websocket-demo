package com.poc.demows.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnvController {

    @GetMapping("/env/{index}")
    public ResponseEntity<String> getAuthHeader(@PathVariable int index){
        List<String> list = List.of("Bearer Add-token-here",
                "Bearer Add-token-here");

        return ResponseEntity.ok(list.get(index));
    }
}
