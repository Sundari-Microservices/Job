package com.alphabet.linkedin.jobms.job.mapper;

import com.alphabet.linkedin.jobms.job.Job;
import com.alphabet.linkedin.jobms.job.dto.JobDTO;
import com.alphabet.linkedin.jobms.job.external.Company;
import com.alphabet.linkedin.jobms.job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDTO(Job job, Company company, List<Review> reviews) {
        JobDTO jobDTO = new JobDTO();

        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        jobDTO.setReview(reviews);




        return jobDTO;
    }
}
