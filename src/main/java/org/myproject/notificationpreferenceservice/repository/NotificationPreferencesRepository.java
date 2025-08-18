package org.myproject.notificationpreferenceservice.repository;

import org.myproject.notificationpreferenceservice.entity.NotificationPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationPreferencesRepository extends JpaRepository<NotificationPreferencesEntity, String> {
}
