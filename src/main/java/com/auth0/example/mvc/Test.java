package com.auth0.example.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
// Variation 1: This allows the controller to take in requests and return a String per the class methods.
@RestController
 */
/*
// Variation 2: This does the same thing as Variation 1, except allows us to use just 1 annotation.
@Controller
@ResponseBody
 */
/*
Note: @RequestMapping doesn't belong here.
 */
/*
// Variation 3: This renders a template in the 'resources/templates' directory if @ResponseBody is not used.
@Controller
 */
@Controller
public class Test {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String foo(final Model model, final Authentication authentication) {
        return "foo";
    }
}
