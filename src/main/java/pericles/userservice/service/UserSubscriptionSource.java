package pericles.userservice.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserSubscriptionSource {
	 @Output("userSubscriptionsChannel")
	    MessageChannel userSubscriptions();
}
