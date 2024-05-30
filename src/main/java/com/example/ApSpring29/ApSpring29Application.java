package com.example.ApSpring29;

import com.example.ApSpring29.aop.Boy;
import com.example.ApSpring29.aop.Girl;
import com.example.ApSpring29.ioc.Vadafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ApSpring29Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(ApSpring29Application.class, args);

		Vadafone vadafone1 = context.getBean(Vadafone.class);
		vadafone1.calling();

    Girl girl = context.getBean(Girl.class);
	girl.study();

	Boy boy = context.getBean(Boy.class);
	boy.study();
	}




	}

