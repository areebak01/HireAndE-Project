package com.bank.alfalah.feature.JobSeeker.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SeekerRequest {

    // Unique identifier for each candidate
    Long candidate_id;
    
    // Candidate's personal information
    String first_name;
    String last_name;
    String email;
    String phone;
    String address;
    String city;
    String state;
    String country;
    String zip_code;
    
    // Educational qualifications
    String education;
    
    // List of skills
    List<String> skills;
    
    // Total years of work experience
    Integer experience;
    
    // Resume file (URL or file path)
    String resume;
    
    // LinkedIn profile URL
    String linkedin_profile;
    
    // Portfolio URL (if applicable)
    String portfolio_url;
    
    // Optional cover letter
    String cover_letter;
    
    // Application status (e.g., Applied, Under Review, Interview, Rejected, Hired)
    String status;
    
    // Job ID the candidate applied for
    Long applied_job_id;
    
    // Date the candidate applied for the job
    String applied_date;  // You can change this to a Date type if needed
    
    // Date scheduled for the interview
    String interview_date; // You can change this to a Date type if needed
    
    // Status of the interview (e.g., Scheduled, Completed, Cancelled)
    String interview_status;
}
