package pericles.userservice.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="core-service")
@RibbonClient(name="core-service")
public interface VoteService {
	
	   @RequestMapping(value = "/vote/{candidate}", method = RequestMethod.GET)
	    public String vote(@PathVariable("candidate") String candidate);

}
