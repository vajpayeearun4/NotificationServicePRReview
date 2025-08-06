package org.myproject.notificationpreferenceservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationPreferenceRepository extends JpaRepository<NotificationPreferencesEntity, String> {
}
