package id.ac.ui.cs.advprog.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class HomePageController {
    @Controller
    public static class HomePageControllerImpl {
        @GetMapping("/")
        public String homePage(Model model) {
            return "HomePage"; 
        }
    }
    
}
