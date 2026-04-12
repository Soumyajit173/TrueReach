package com.guvi.projects.TrueReach.repo;

import com.guvi.projects.TrueReach.model.MailingList;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MailingListRepository extends MongoRepository<MailingList, String> {
    List<MailingList> findByUserId(String userId);
}
