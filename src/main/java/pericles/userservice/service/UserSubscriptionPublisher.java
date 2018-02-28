package pericles.userservice.service;

import org.springframework.cloud.stream.annotation.EnableBinding;

import pericles.userservice.api.UserSubscriptionSource;

@EnableBinding(UserSubscriptionSource.class)
public class UserSubscriptionPublisher {

}
