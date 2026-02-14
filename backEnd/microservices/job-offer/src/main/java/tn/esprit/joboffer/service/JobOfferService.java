package tn.esprit.joboffer.service;

import org.springframework.stereotype.Service;
import tn.esprit.joboffer.entity.JobOffer;
import tn.esprit.joboffer.repository.JobOfferRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobOfferService {

    private final JobOfferRepository repository;

    public JobOfferService(JobOfferRepository repository) {
        this.repository = repository;
    }

    public List<JobOffer> getAllJobOffers() {
        return repository.findAll();
    }

    public Optional<JobOffer> getJobOfferById(Long id) {
        return repository.findById(id);
    }

    public JobOffer createJobOffer(JobOffer jobOffer) {
        return repository.save(jobOffer);
    }

    public JobOffer updateJobOffer(Long id, JobOffer jobOfferDetails) {
        JobOffer jobOffer = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("JobOffer not found"));
        jobOffer.setJobTitle(jobOfferDetails.getJobTitle());
        jobOffer.setCompany(jobOfferDetails.getCompany());
        jobOffer.setIndustry(jobOfferDetails.getIndustry());
        jobOffer.setLocation(jobOfferDetails.getLocation());
        jobOffer.setSalaryRange(jobOfferDetails.getSalaryRange());
        return repository.save(jobOffer);
    }

    public void deleteJobOffer(Long id) {
        repository.deleteById(id);
    }
}
