package com.guvi.projects.TrueReach.service;

import com.guvi.projects.TrueReach.model.MailingList;
import com.guvi.projects.TrueReach.model.Subscriber;

import java.util.List;

public interface MailingListService {
    MailingList createList(String name, String userId);
    MailingList addSubscriber(String listId, Subscriber subscriber);
    MailingList removeSubscriber(String listId, String email);
    List<MailingList> getUserLists(String userId);
}