package com.rakuten.internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void run(String... strings) throws Exception {
        jdbcTemplate.execute("CREATE TABLE todos(" +
                "id , title VARCHAR(255), description VARCHAR(255))");
    
        jdbcTemplate.update("INSERT INTO todos(title, description) VALUES ('Internship HW','make todo lists')");
    }
}
