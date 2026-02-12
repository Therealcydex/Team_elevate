package tn.esprit.joboffer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long opportunityId;

    private String jobTitle;
    private String company;
    private String industry;
    private String location;
    private String salaryRange;

    // Constructors
    public JobOffer() {}

    public JobOffer(String jobTitle, String company, String industry, String location, String salaryRange) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.industry = industry;
        this.location = location;
        this.salaryRange = salaryRange;
    }

    // Getters and Setters
    public Long getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(Long opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }
}
