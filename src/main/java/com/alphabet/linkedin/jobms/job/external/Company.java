package com.alphabet.linkedin.jobms.job.external;


public class Company {

//    fields: {companyId, companyName, companyDescription, companyLocation, List<job> jobs}

    private Long id;
    private String companyName;
    private String companyDescription;
    private String companyLocation;
    private long jobId;
    private long reviewId;



    public Company(){

    }

//    public Company(Long id, String companyName, String companyDescription, String companyLocation, List<Job> jobs, List<Review> reviews) {
//        this.id = id;
//        this.companyName = companyName;
//        this.companyDescription = companyDescription;
//        this.companyLocation = companyLocation;
//        this.jobs = jobs;
//        this.reviews = reviews;
//    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", companyDescription='" + companyDescription + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", jobId=" + jobId +
                ", reviewId=" + reviewId +
                '}';
    }
}
