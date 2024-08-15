package com.codingnomads.corespring.examples.application_context.customeventlistener;

import org.springframework.context.ApplicationListener;

public class SecondUserRegistrationCompleteEventListener implements ApplicationListener<UserRegistrationCompletedEvent> {
    @Override
    public void onApplicationEvent(UserRegistrationCompletedEvent event) {
        System.out.println("-----Received UserRegistrationCompletedEvent as a second event-----");
        System.out.println();
    }
}
