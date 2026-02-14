package tn.esprit.joboffer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.joboffer.entity.JobOffer;
import tn.esprit.joboffer.service.JobOfferService;

import java.util.List;

@RestController
@RequestMapping("/api/joboffers")
public class JobOfferController {

    private final JobOfferService service;

    public JobOfferController(JobOfferService service) {
        this.service = service;
    }

    @GetMapping
    public List<JobOffer> getAllJobOffers() {
        return service.getAllJobOffers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobOffer> getJobOfferById(@PathVariable Long id) {
        return service.getJobOfferById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public JobOffer createJobOffer(@RequestBody JobOffer jobOffer) {
        return service.createJobOffer(jobOffer);
    }

    @PutMapping("/{id}")
    public JobOffer updateJobOffer(@PathVariable Long id, @RequestBody JobOffer jobOfferDetails) {
        return service.updateJobOffer(id, jobOfferDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobOffer(@PathVariable Long id) {
        service.deleteJobOffer(id);
        return ResponseEntity.noContent().build();
    }
}
