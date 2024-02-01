package com.lld.reviewSystem.notifier;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEmailNotifierImpl implements UserEmailNotifier {

    @Override
    public NotificationState notifyUser(UserEmailNotification notification) {
        //make an effort to send email asynchronously
        return NotificationState.SUCCESS;
    }
}
