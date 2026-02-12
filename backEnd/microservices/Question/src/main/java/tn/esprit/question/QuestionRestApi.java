package tn.esprit.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Questions")
public class QuestionRestApi {
    @Autowired
    private QuestionDao questionRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @DeleteMapping
    public void delete() {
        questionRepository.deleteAll();
    }
}
