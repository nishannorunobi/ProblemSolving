package com.nishan.app.endpoints.api.jpa;

import com.nishan.app.domain.User;
import com.nishan.app.services.jpa.JpaTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/jpa")
public class JpaTestController {
    @Autowired
    private JpaTestServiceImpl jpaTestService;


    @PostMapping("/register")
    public void createJpaData(@Valid @RequestBody User user){
        jpaTestService.create_no_tx_success(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(name = "id") Long id){
        return jpaTestService.get_no_tx_success(id);
    }
}
