package junk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationPreferenceRepository repo;

    public void updatePreferences(String userId, List<String> preferences) {
        NotificationPreferencesEntity entity = new NotificationPreferencesEntity();
        entity.setUserId(userId);
        entity.setPreferences(String.join(",", preferences));
        repo.save(entity);
    }

    List<NotificationPreferencesEntity> getAllNotificationPreferences() {
        return repo.findAll();
    }
}
