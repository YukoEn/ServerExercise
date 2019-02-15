package fi.haagahelia.CustomerListJDBC.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @RequestMapping(value="/customerlist")
    public String customertList(Model model) {	
        // Fetch all customers
        List<Map<String, Object>> customers = jdbcTemplate.queryForList("select first_name, last_name, streetaddress, postcode, postoffice, phone, email from customer");
        
        // Add customerlist to model and return to view
        model.addAttribute("customers", customers);
        return "customerlist";
    }	
	
}
