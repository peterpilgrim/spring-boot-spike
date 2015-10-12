package com.acme.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by ppilgrim on 09-Oct-2015.
 */
@Controller
public class WelcomeController {

    // Why does this works?
    //
    // SEE ALSO: http://stackoverflow.com/questions/3320674/spring-how-do-i-inject-an-httpservletrequest-into-a-request-scoped-bean
    //
    // Also compare with CDI 1.1 - LOL
    private @Autowired HttpServletRequest injectedRequest;
    private @Autowired HttpServletRequest injectedResponse;

    @RequestMapping("/welcome")
    public String indexPage( Model models)
    {
        final HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        final HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getResponse();

        models.addAttribute("contextPath", request.getContextPath());
        models.addAttribute("page", request.getRequestURI());
        models.addAttribute("request", request);
        models.addAttribute("response", response);
        return "welcome";
    }

    @RequestMapping("/blowup")
    public String foo(final Map<String, Object> models) {
        throw new RuntimeException("Foo");
    }

}
