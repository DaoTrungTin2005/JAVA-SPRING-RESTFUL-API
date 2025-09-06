package vn.hoidanit.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootApplication(exclude =
org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class jobhunterApplication {

	public static void main(String[] args) {
		SpringApplication.run(jobhunterApplication.class, args);
	}

}
