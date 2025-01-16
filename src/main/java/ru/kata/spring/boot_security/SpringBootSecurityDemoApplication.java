package ru.kata.spring.boot_security;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ru.kata.spring.boot_security.model.Role;
import ru.kata.spring.boot_security.model.User;
import ru.kata.spring.boot_security.service.RoleService;
import ru.kata.spring.boot_security.service.UserService;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(UserService userService, RoleService roleService) {
		return args -> {
			Role roleAdmin = new Role("ADMIN");
			Role roleUser = new Role("USER");
			
			roleService.save(roleAdmin);
			roleService.save(roleUser);

			User admin = new User("admin", "admin", "admin", 35,
			"admin@mail.ru", List.of(roleAdmin, roleUser));
			userService.save(admin);

			User user = new User("user", "user", "user", 24,
			"user@mail.ru", List.of(roleUser));
			userService.save(user);
		};
	}
}
