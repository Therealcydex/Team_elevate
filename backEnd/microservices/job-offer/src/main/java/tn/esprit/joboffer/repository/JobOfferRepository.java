package tn.esprit.joboffer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.joboffer.entity.JobOffer;

public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {
    // You can add custom queries here if needed
}
