package com.bruyako;

import com.bruyako.entity.User;
import com.bruyako.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
@Controller
public class MainController {

    @Autowired
    private BaseService<User> service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String authLogin(Model model) {
        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {
        return "home";
    }
}
