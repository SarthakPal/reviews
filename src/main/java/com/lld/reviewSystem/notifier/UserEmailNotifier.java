package com.lld.reviewSystem.notifier;

public interface UserEmailNotifier {
    NotificationState notifyUser(UserEmailNotification notification);
}
