package com.guvi.projects.TrueReach.repo;

import com.guvi.projects.TrueReach.model.Campaign;
import com.guvi.projects.TrueReach.model.CampaignStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CampaignRepository extends MongoRepository<Campaign, String> {

    Page<Campaign> findAll(Pageable pageable);

    Page<Campaign> findByStatus(CampaignStatus status, Pageable pageable);
}
