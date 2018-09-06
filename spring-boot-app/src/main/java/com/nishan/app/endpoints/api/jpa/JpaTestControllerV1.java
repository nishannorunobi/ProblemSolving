package com.nishan.app.endpoints.api.jpa;

import com.nishan.app.domain.User;
import com.nishan.app.services.jpa.JpaTestServiceImplV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v1/jpa")
public class JpaTestControllerV1 {
    @Autowired
    private JpaTestServiceImplV1 jpaTestService;


    @PostMapping("/save/tx/no")
    public void postFail(@Valid @RequestBody User user){
        jpaTestService.save_no_tx_fail(user);
    }

    @GetMapping("/get/tx/no/{id}")
    public User getSuccess(@PathVariable(name = "id") Long id){
        return jpaTestService.get_no_tx_success(id);
    }

    @PutMapping("/update/tx/no/{id}")
    public User update(@PathVariable(name = "id") Long id,
                       @Valid @RequestBody User user){
        return jpaTestService.update_no_tx_fail(user,id);
    }
}
