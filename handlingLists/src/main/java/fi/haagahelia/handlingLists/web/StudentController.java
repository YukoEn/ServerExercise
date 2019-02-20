package fi.haagahelia.handlingLists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.handlingLists.domain.Student;

@Controller
public class StudentController {

    @RequestMapping("/hello")
    public String greeting(Model model) {
      	ArrayList<Student> studentList = new ArrayList<Student>();
    	studentList.add(new Student("Kate", "Cole", "kate.cole@haaga-helia.fi"));
    	studentList.add(new Student("Dan", "Brown", "dan.brown@haaga-helia.fi"));
    	studentList.add(new Student("Mike", "Mars", "mike.mars@haaga-helia.fi"));    	   	    	
        model.addAttribute("students", studentList);
        return "hello";
    }

}