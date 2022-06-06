package hello.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public class Hello {

    @GetMapping("/hi")
    public String  getHello(@RequestParam(required = false) String name){
        return "hello " + name;
    }

    @GetMapping("/hi/{name}")
    public String helloPathVar(@PathVariable(value = "name") String person){
        return "hi " + person;
    }

}
