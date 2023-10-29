package com.pirates.lab.service;

import com.pirates.lab.dto.downstream.UploadJobRequest;

public interface UploadJobService {

    public boolean uploadJob(UploadJobRequest uploadJobRequest);
}
