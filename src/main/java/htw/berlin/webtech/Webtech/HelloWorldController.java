package htw.berlin.webtech.Webtech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {
    @GetMapping(path = "/hello")
   public ModelAndView showHelloWorld() {
        return new ModelAndView("helloworld");
    }
}




/* WORKS
public String showHelloWorld() {
        return "helloworld";
    }
 */