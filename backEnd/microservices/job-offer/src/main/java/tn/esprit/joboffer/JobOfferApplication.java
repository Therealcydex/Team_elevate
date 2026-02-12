package tn.esprit.joboffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JobOfferApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobOfferApplication.class, args);
	}

}
