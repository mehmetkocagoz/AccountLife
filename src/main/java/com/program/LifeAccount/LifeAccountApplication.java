package com.program.LifeAccount;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LifeAccountApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LifeAccountApplication.class, args);
	}

}
