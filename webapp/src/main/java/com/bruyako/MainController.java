package com.bruyako;

import com.bruyako.service.BaseService;
import com.bruyako.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by brunyatko on 20.03.16.
 */
@Controller
public class MainController {

    @Autowired
    private BaseService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAllUsers(Model model) {

        model.addAttribute("allUsers", service.getAll());

        return "temp";
    }
}
