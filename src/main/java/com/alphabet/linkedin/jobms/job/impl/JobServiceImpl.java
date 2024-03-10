package com.alphabet.linkedin.jobms.job.impl;
import com.alphabet.linkedin.jobms.job.Job;
import com.alphabet.linkedin.jobms.job.dto.JobWithCompnayDTO;

import java.util.List;

public interface JobServiceImpl {
    public List<JobWithCompnayDTO> findAll();
    public String createJob(Job job);
    public boolean updateJob(long id, Job job);
    public boolean deleteJob(Long id);
    public Job getJob(Long id);

}
