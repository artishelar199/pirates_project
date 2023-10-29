package com.pirates.lab.dto.downstream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UploadJobRequest implements Serializable {
    private String pSNumber;
    private String jobLevel;
    private String jobTitle;
    private String jobDescription;
    private String eligibility;
    private String primarySkills;
    private String secondarySkill;
    private String otherSkills;
    private int requiredExperience;
    private String rolesAndResponsibility;
    private String position;
    private String upload_date;
    private int status;
}
