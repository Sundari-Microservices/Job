package com.alphabet.linkedin.jobms.job.impl;
import com.alphabet.linkedin.jobms.job.Job;
import java.util.List;

public interface JobServiceImpl {
    public List<Job> findAll();
    public String createJob(Job job);
    public boolean updateJob(long id, Job job);
    public boolean deleteJob(Long id);
    public Job getJob(Long id);

}
