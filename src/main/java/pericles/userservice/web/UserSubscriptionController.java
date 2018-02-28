package pericles.userservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pericles.userservice.api.UserSubscriptionSource;
import pericles.userservice.domain.UserSubscription;

@RestController
public class UserSubscriptionController {

	@Autowired
	UserSubscriptionSource userSubscriptionSource;

	@RequestMapping("/subscription")
	public String subscribeUser(@RequestBody UserSubscription userSubscription) {
		userSubscriptionSource.userSubscriptions().send(MessageBuilder.withPayload(userSubscription).build());
		System.out.println(userSubscription.toString());
		return "user subscribed!";
	}
}
