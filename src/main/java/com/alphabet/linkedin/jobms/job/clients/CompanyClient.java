package com.alphabet.linkedin.jobms.job.clients;

import com.alphabet.linkedin.jobms.job.external.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="company-ms")
public interface CompanyClient {

    @GetMapping("companies/{id}")
 Company getCompany(@PathVariable("id") long id);
}
