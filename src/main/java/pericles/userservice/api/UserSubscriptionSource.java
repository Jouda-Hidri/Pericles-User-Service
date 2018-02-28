package pericles.userservice.api;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserSubscriptionSource {
	 @Output("userSubscriptionsChannel")
	    MessageChannel userSubscriptions();
}
