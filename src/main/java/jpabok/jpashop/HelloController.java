package jpabok.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")                                               // url name
    public String hello(Model model) {                                 // view 로 넘길수있음
        model.addAttribute("data", "Hello~~");  // data라는 키의 값에 hello~~ 를 넘김
        return "hello2";                                               // view 이름.
    }
}
