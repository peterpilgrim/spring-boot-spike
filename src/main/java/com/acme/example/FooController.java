package com.acme.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ppilgrim on 09-Oct-2015.
 */
@Controller
public class FooController {

    @RequestMapping("/foo")
    public String index(Model model) {
        model.addAttribute("foo", "Hello Handlebars!");
        return "foo";
    }
}
