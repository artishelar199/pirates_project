package com.pirates.lab.controller;

import com.pirates.lab.dto.downstream.UploadJobRequest;
import com.pirates.lab.service.UploadJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pirates")
public class UploadJobController {

    @Autowired
    private UploadJobService uploadJobService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadJob(@RequestBody UploadJobRequest uploadJobRequest){
        return (uploadJobService.uploadJob(uploadJobRequest)) ? ResponseEntity.ok("Success") : new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }
}
