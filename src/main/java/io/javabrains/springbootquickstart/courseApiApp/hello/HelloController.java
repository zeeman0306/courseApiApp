package io.javabrains.springbootquickstart.courseApiApp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //With this annotation, the URL extension in the quotes executes this method when it is called in the web browser
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }

}
