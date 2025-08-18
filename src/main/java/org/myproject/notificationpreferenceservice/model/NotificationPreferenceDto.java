package org.myproject.notificationpreferenceservice.model;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class NotificationPreferenceDto {
    @NotBlank(message = "User id is mandatory")
    private String userId;
    private List<String> preferences;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
