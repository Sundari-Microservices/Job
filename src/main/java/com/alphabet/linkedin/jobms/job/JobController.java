package com.alphabet.linkedin.jobms.job;

import com.alphabet.linkedin.jobms.job.dto.JobDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;


    /*
          GET /jobs: Get all jobs.
          GET /jobs/{job-id}: Get a particular job based on job-id.
          POST /jobs: Creates a new job {RequestBody should contain the job details.}
          DELETE /jobs/{job-id} : Delete a specific job by job-id.
          PUT /jobs/{id} : Updates a specific job by ID {RequestBody should contain the updated job details.}
         */


//    @GetMapping("/jobs")
//    @RequestMapping(method = RequestMethod.GET, value = "/jobs")
    @GetMapping
    public ResponseEntity<List<JobDTO>> findAllJobs() {
        return ResponseEntity.ok(jobService.findAll());
    }

    //    @GetMapping("/jobs/{id}")
//    @RequestMapping(method = RequestMethod.GET, value = "/jobs/{id}")
    @GetMapping("/{id}")
    public ResponseEntity<JobDTO> findJobById(@PathVariable Long id) {

        JobDTO jobDTO = jobService.getJob(id);
        if (jobDTO != null) {
            return new ResponseEntity<>(jobDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

//    @PostMapping("/jobs/addJob")
//    @RequestMapping(method = RequestMethod.POST, value="/jobs/addJob")
    @RequestMapping(method = RequestMethod.POST, value="/addJob")
    public ResponseEntity<String> createJob(@RequestBody Job job) {

            String message = jobService.createJob(job);
            return new ResponseEntity<>(message, HttpStatus.CREATED);

    }

//    @DeleteMapping("/jobs/{id}")
//    @RequestMapping(method=RequestMethod.DELETE, value="/jobs/{id}")
    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public ResponseEntity<String> deleteJobByID(@PathVariable long id) {
        boolean status = jobService.deleteJob(id);
//        if(!message.contains("failed to delete")){
//            return new ResponseEntity<>(message, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
//        }

        if (status) {
            return new ResponseEntity<>("job with id: " + id + " deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("job with id: " + id + " failed to delete", HttpStatus.NOT_FOUND);
        }


    }

//    @RequestMapping(method = RequestMethod.PUT, value="/jobs/{id}")
//    @PutMapping("/jobs/{id}")
   @PutMapping("/{id}")
    public ResponseEntity<String> updateJob(@PathVariable int id, @RequestBody Job job) {
        boolean status = jobService.updateJob(id, job);
        if (status) return new ResponseEntity<>("Job updated", HttpStatus.OK);
        else return new ResponseEntity<>("Job failed to update", HttpStatus.NOT_FOUND);
    }
}
