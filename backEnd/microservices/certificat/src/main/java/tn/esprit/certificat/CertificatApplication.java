package tn.esprit.certificat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CertificatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CertificatApplication.class, args);
    }

}
