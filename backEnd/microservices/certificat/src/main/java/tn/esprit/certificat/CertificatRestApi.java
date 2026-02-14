package tn.esprit.certificat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/certificats")
public class CertificatRestApi {

    @Autowired
    private CertificatRepository certificatRepository;

    @GetMapping("/hello")
    public String hello() {
        return "hello! this is certificat!";
    }

    @PostMapping
    public List<Certificat> findAllCertificats() {
        return certificatRepository.findAll();
    }
}
