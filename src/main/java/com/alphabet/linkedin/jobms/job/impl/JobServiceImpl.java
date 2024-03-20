package com.alphabet.linkedin.jobms.job.impl;
import com.alphabet.linkedin.jobms.job.Job;
import com.alphabet.linkedin.jobms.job.dto.JobDTO;

import java.util.List;

public interface JobServiceImpl {
    public List<JobDTO> findAll();
    public String createJob(Job job);
    public boolean updateJob(long id, Job job);
    public boolean deleteJob(Long id);
    public JobDTO getJob(Long id);

}
