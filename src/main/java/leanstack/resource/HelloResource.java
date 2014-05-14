package leanstack.resource;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import leanstack.service.Greeting;
import leanstack.service.HelloService;

@Path("hello")
public class HelloResource {
    
    @Inject
    private HelloService service;

    @GET
    @Produces( APPLICATION_JSON )
    public Greeting getGreeting() {
        return service.getGreeting();
    }
}
