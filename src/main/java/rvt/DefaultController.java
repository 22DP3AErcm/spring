package rvt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class DefaultController {
    csv csv = new csv();
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/about")
    ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
        // Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        // Book book2 = new Book("Robert Martin", "Clean Code", 1);
        // Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        // CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        // CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        // CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);
        // System.out.println(cd1);
        // System.out.println(cd2);
        // System.out.println(cd3);

        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        System.out.println(box);
        return modelAndView;
    }

    @GetMapping(value = "/test")
    public ModelAndView test(@RequestParam HashMap<String, String> allParams, User user){
        
        if(allParams.containsKey("success")){
            ModelAndView modelAndView = new ModelAndView("success"); 
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("test"); 
        return modelAndView;
    }


    @PostMapping(value = "/test")
    public String test1(@ModelAttribute("user") User user, BindingResult bindingResult){


        if (bindingResult.hasErrors()) {
            return "/test";
        }
        
        csv.addDataToCSV(user);
        return "redirect:/test?success";
        
    }

    
    
}
