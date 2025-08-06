package org.myproject.notificationpreferenceservice;

import java.util.List;

public class NotificationPreferenceDto {
    private String userId;
    private List<String> preferences;

    public String getUserId() {
        return userId;
    }

    public List<String> getPreferences() {
        return preferences;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }
}
