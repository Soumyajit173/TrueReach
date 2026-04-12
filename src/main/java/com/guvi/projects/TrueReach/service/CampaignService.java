package com.guvi.projects.TrueReach.service;

import com.guvi.projects.TrueReach.dto.CampaignPageResponse;
import com.guvi.projects.TrueReach.model.Campaign;

import java.time.LocalDateTime;
import java.util.List;

public interface CampaignService {

    Campaign createCampaign(Campaign campaign, String username);

    Campaign scheduleCampaign(String campaignId, LocalDateTime time);

    Campaign sendCampaign(String campaignId);

    Campaign getCampaignById(String campaignId);

    CampaignPageResponse getCampaigns(String status, int page, int size);
}