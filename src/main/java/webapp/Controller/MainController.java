package webapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello") 
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
}
