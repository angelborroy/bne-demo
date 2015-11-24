package es.bne.webapp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import es.bne.webapp.service.UserService;
import es.bne.webapp.service.dto.UserDto;

// http://docs.spring.io/autorepo/docs/spring-framework/4.0.x/spring-framework-reference/html/mvc.html#mvc-controller

@Controller
@Scope("request")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody List<UserDto> usersList() {
    	logger.debug("HTTP GET users");
        return userService.findAll();
    }
}

 
