package tn.esprit.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("tn.esprit.question")
@EnableJpaRepositories("tn.esprit.question")
@SpringBootApplication
@EnableDiscoveryClient

public class QuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionApplication.class, args);
    }

}
