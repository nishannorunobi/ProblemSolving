package com.nishan.app.endpoints.api.jpa;

import com.nishan.app.domain.User;
import com.nishan.app.services.jpa.JpaTestServiceImplV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v2/jpa")
public class JpaTestControllerV2 {
    @Autowired
    private JpaTestServiceImplV2 jpaTestService;

    @PostMapping("/save/tx/mymethod")
    public void postFail(@Valid @RequestBody User user) {
        jpaTestService.save_my_method_tx(user);
    }

    @PutMapping("/update/tx/mymethod/{id}")
    public void postFail(@PathVariable Long id,
                         @Valid @RequestBody User user) {
        jpaTestService.update_my_method_tx(user,id);
    }

}
