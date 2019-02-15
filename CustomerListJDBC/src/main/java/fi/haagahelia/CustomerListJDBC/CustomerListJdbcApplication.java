package fi.haagahelia.CustomerListJDBC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class CustomerListJdbcApplication {
	private static final Logger log = LoggerFactory.getLogger(CustomerListJdbcApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerListJdbcApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
		return (args) -> {
			// Database is created by using resources/schema.sql
			
			// Insert some demo data
	        jdbcTemplate.update("insert into customer(first_name, last_name, streetaddress, postcode, postoffice, phone, email) "
	        		+ "values (?, ?, ?, ?, ?, ?, ?)", "John", "West", "Kuusikuja 6", "01200", "Vantaa", "0449212278", "jwest@yahoo.com" );
	        jdbcTemplate.update("insert into customer(first_name, last_name, streetaddress, postcode, postoffice, phone, email) "
	        		+ "values (?, ?, ?, ?, ?, ?, ?)", "Mike", "Mars", "Asematori 3", "00520", "Helsinki", "0909954367", "marsms@gmail.com" );
	        jdbcTemplate.update("insert into customer(first_name, last_name, streetaddress, postcode, postoffice, phone, email) "
	        		+ "values (?, ?, ?, ?, ?, ?, ?)", "Kate", "Johnson", "Keilaranta 1", "02150", "Espoo", "04077882322", "kjohnson@kotimaa.fi" );
		};
	}

}

