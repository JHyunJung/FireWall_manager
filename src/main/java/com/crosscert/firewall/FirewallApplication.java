package com.crosscert.firewall;

import com.crosscert.firewall.testgit.PushTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FirewallApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirewallApplication.class, args);
		PushTest.pushTest();
	}

}
