package org.myproject.notificationpreferenceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preferences")
public class NotificationPreferencesController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/update")
    public ResponseEntity<String> updatePreferences(@RequestBody NotificationPreferenceDto dto) {
        notificationService.updatePreferences(dto.getUserId(), dto.getPreferences());
        return ResponseEntity.ok("Updated");
    }

    @GetMapping
    public ResponseEntity<List<NotificationPreferencesEntity>> getPreferences() {
        return new ResponseEntity<>(notificationService.getAllNotificationPreferences(), HttpStatus.OK);
    }
}
