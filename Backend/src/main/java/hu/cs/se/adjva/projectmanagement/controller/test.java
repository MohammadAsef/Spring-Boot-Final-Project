package hu.cs.se.adjva.projectmanagement.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    
    @GetMapping("/test")
    public String testing(){
        return "Testing Successfully done";
    }
}
