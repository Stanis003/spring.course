package spring.course;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldConrtoller {

    //need controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    //new a controller method read
    @RequestMapping("/processFormVersionTwo")
    public String letsShow(HttpServletRequest request, Model model) {

        //read request from HTML
        String theName = request.getParameter("studentName");

        //convert
        theName = theName.toUpperCase();

        //create model
        String result = "Yo" + theName;

        //add message
        model.addAttribute("message", result);


        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName,
                                          Model model) {

        //convert
        theName = theName.toUpperCase();

        //create model
        String result = "Yo!  " + theName;

        //add message
        model.addAttribute("message", result);


        return "helloworld";
    }



}
