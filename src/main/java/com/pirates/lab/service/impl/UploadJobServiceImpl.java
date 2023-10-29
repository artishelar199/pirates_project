package com.pirates.lab.service.impl;

import com.pirates.lab.dto.downstream.UploadJobRequest;
import com.pirates.lab.model.entity.UploadJob;
import com.pirates.lab.model.repository.UploadJobRepository;
import com.pirates.lab.service.UploadJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadJobServiceImpl implements UploadJobService {

    @Autowired
    private UploadJobRepository uploadRepo;

    @Override
    public boolean uploadJob(UploadJobRequest uploadJobRequest) {

        UploadJob uploadJob = new UploadJob();
        boolean isUploaded = false;
        int jobId = uploadRepo.getLastJobId();
        jobId = jobId+1;
       /* uploadJob.builder().job_id(jobId)
                .ps_number(uploadJobRequest.getPSNumber())
                .job_level(uploadJobRequest.getJobLevel())
                .job_title(uploadJobRequest.getJobTitle())
                .job_description(uploadJobRequest.getJobDescription())
                .eligibility(uploadJobRequest.getEligibility())
                .primary_skill(uploadJobRequest.getPrimarySkills())
                .secondary_skill(uploadJobRequest.getSecondarySkill())
                .other_skills(uploadJobRequest.getOtherSkills())
                .required_experience(uploadJobRequest.getRequiredExperience())
                .roles_and_responsibility(uploadJobRequest.getRolesAndResponsibility())
                .position(uploadJobRequest.getPosition())
                .upload_date(uploadJobRequest.getUpload_date())
                .status_id(uploadJobRequest.getStatus()).build();*/
        uploadJob.setJob_level(uploadJobRequest.getJobLevel());
        uploadJob.setJob_id(jobId);
        uploadJob.setJob_title(uploadJobRequest.getJobTitle());
        uploadJob.setJob_description(uploadJobRequest.getJobDescription());
        uploadJob.setEligibility(uploadJobRequest.getEligibility());
        uploadJob.setPrimary_skill(uploadJobRequest.getPrimarySkills());
        uploadJob.setSecondary_skill(uploadJobRequest.getSecondarySkill());
        uploadJob.setOther_skills(uploadJobRequest.getOtherSkills());
        uploadJob.setRequired_experience(uploadJobRequest.getRequiredExperience());
        uploadJob.setRoles_and_responsibility(uploadJobRequest.getRolesAndResponsibility());
        uploadJob.setPosition(uploadJobRequest.getPosition());
        uploadJob.setUpload_date(uploadJobRequest.getUpload_date());
        uploadJob.setStatus_id(uploadJobRequest.getStatus());

        try{
            uploadRepo.save(uploadJob);
            isUploaded = true;
        }catch(Exception exception){

        }finally{

        }
        return isUploaded;
    }
}
