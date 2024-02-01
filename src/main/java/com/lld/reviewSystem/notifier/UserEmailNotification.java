package com.lld.reviewSystem.notifier;

import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
import com.lld.reviewSystem.utils.*;

@Getter
@Setter
public class UserEmailNotification {
    private long emailNotificationId;
    private String userId;
    private String id;
    private String message;
    private String subject;
    private Instant notifiedOn;
    private NotificationState notificationState;

    public UserEmailNotification() {}

    public UserEmailNotification(String userId, String message,
                                 String subject, Instant notifiedOn) {
        this.emailNotificationId = Utils.getRandomLong();
        this.userId = userId;
        this.message = message;
        this.subject = subject;
        this.notifiedOn = notifiedOn;
    }
}
