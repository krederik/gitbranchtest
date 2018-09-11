package clbo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class movieController {

    @GetMapping("/")
    public String index(){
            return "index";
    }

    @GetMapping("/second")
    public String second(){
            return "second";
    }

}
