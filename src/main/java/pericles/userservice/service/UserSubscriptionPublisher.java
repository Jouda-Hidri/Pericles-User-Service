package pericles.userservice.service;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(UserSubscriptionSource.class)
public class UserSubscriptionPublisher {

}
