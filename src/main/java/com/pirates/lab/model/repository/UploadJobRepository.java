package com.pirates.lab.model.repository;

import com.pirates.lab.model.entity.UploadJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadJobRepository extends JpaRepository<UploadJob, Integer> {

    @Query(value = "select max(u.job_id) from upload_job u", nativeQuery = true)
    public Integer getLastJobId();
}
