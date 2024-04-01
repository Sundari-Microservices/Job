package com.alphabet.linkedin.jobms.job.clients;

import com.alphabet.linkedin.jobms.job.external.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("review-ms")
public interface ReviewClient {

    @GetMapping("/reviews")
    List<Review> getReviews(@RequestParam("companyId") long companyId);


}
