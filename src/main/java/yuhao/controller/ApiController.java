package yuhao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 喻浩
 * @create 2020-02-12-12:24
 */
@RestController
public class ApiController {
    
    @GetMapping("/test")
    public String test(){
        return "hello world!";
    }
}
