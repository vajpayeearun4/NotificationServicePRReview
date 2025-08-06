package org.myproject.notificationpreferenceservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notification_preferences")
public class NotificationPreferencesEntity {

    @Id
    private String userId;

    @Column(name = "preferences")
    private String preferences; // comma separated values like "EMAIL,SMS"

    public String getUserId() {
        return userId;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
