package spring.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        //create a student object
        Student theStudent = new Student();

        //add student object to the model
        theModel.addAttribute("student", theStudent);

        //add the country options to the model
        theModel.addAttribute("theCountryOptions", countryOtions);

        return "student-form";
    }
    @RequestMapping("/processForm")
    public  String processForm(@ModelAttribute("student") Student theStudent){

        //log the input data

        return  "student-confirmation";
    }
    @Value("#{countryOptions}")
    private Map<String, String> countryOtions;

}
