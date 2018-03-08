package pericles.userservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pericles.userservice.domain.UserSubscription;
import pericles.userservice.service.UserSubscriptionSource;

@RestController
public class UserSubscriptionController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserSubscriptionSource userSubscriptionSource;

	@RequestMapping("/subscription")
	public void subscribeUser(@RequestBody UserSubscription userSubscription) {
		userSubscriptionSource.userSubscriptions().send(MessageBuilder.withPayload(userSubscription).build());
		log.info("User sent : " + userSubscription.toString());
	}
}
