package org.myproject.notificationpreferenceservice.service;

import org.myproject.notificationpreferenceservice.entity.NotificationPreferencesEntity;
import org.myproject.notificationpreferenceservice.repository.NotificationPreferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationPreferencesRepository repo;

    public void updatePreferences(String userId, String name, List<String> preferences) {
        NotificationPreferencesEntity entity = new NotificationPreferencesEntity();
        entity.setUserId(userId);
        entity.setName(name);
        entity.setPreferences(String.join(",", preferences));
        repo.save(entity);
    }

    public List<NotificationPreferencesEntity> getAllNotificationPreferences() {
        return repo.findAll();
    }
}
