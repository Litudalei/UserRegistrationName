package com.git.controller;

import com.git.binding.UserRegistration;
import com.git.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    UserRepo repo;

    @GetMapping("/form")
    public String loadForm(Model m)
    {

        m.addAttribute("userReg",new UserRegistration());
        return "index";
    }
@PostMapping("/register")
    String submitForm(com.git.Entity.UserRegistration user, Model m)
{
    repo.save(user);
    System.out.println(user);
    System.out.println("inserted success fully");
    m.addAttribute("user",user);
    m.addAttribute("msg","user registration successfull");
    return "success";
}

}
