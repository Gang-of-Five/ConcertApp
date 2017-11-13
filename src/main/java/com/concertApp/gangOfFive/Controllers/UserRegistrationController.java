package com.concertApp.gangOfFive.Controllers;

import com.concertApp.gangOfFive.Converters.UserConverter;
import com.concertApp.gangOfFive.Domain.User;
import com.concertApp.gangOfFive.Model.UserRegisterForm;
import com.concertApp.gangOfFive.Services.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserRegistrationController {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
    private static final String REGISTER_USER_FORM = "insertUserForm";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home/insertUser", method = RequestMethod.GET)
    public String register(Model model) {
        logger.info("Into the User Registration page controller");
        model.addAttribute(REGISTER_USER_FORM, new UserRegisterForm());

        return "insertUser";
    }

    @RequestMapping(value= "/home/insertUser", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute(REGISTER_USER_FORM)
                           UserRegisterForm userRegisterForm,
                           BindingResult bindingResult, HttpSession session,
                           RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            logger.error(String.format("%s Validation Errors present: ", bindingResult.getErrorCount()));
            System.err.println(bindingResult);
            return "insertUser";
        }

        try {
            User user = UserConverter.buildUserObject(userRegisterForm);
            userService.save(user);
            logger.info("User Registration Completed");
            session.setAttribute("username", userRegisterForm.getUsername());
        } catch (Exception exception) {
            redirectAttributes.addFlashAttribute("errorMessage", exception.getMessage());
            logger.error("User Registration Failed: " + exception);

            return "insertUser";
        }
        redirectAttributes.addFlashAttribute("message", "You have succesfully registered a new User");

        return "insertUser";
    }
}
