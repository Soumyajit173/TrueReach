package com.guvi.projects.TrueReach.dto;

import com.guvi.projects.TrueReach.model.Campaign;

import java.util.List;

public record CampaignPageResponse(
        List<Campaign> campaigns,
        int currentPage,
        long totalItems,
        int totalPages,
        int pageSize
) {}