package pericles.userservice.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="gateway-server")
@RibbonClient(name="core-service")
public interface VoteService {
	
	   @RequestMapping(value = "/core-service/vote/{candidate}", method = RequestMethod.GET)
	    public String vote(@PathVariable("candidate") String candidate);

}
