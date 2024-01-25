package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/about")
    ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
        return modelAndView;
    }
    @GetMapping(value = "/test")
    ModelAndView test(){
        ModelAndView test = new ModelAndView("test"); 
        Money money = new Money((byte) 20);
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        //test.addObject("result", "Rezultāts: " + money.plus((byte) 20));
        
        test.addObject("result", "Rezultāts: " + Sort.indexOfSmallestFrom(array, 3));
        return test;
    }
    
}
