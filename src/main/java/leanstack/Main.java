package leanstack;

import java.net.URI;

import leanstack.resource.HelloResource;
import leanstack.service.HelloService;
import leanstack.service.HelloServiceImpl;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

    public static void main(String[] args) throws Exception {

        URI baseUri = new URI("http://localhost:9998/");
        
        ResourceConfig config = new ResourceConfig(HelloResource.class);
        config.register(new AbstractBinder(){
            @Override
            protected void configure() {
                bind(HelloServiceImpl.class).to(HelloService.class);
            }
        });
        JettyHttpContainerFactory.createServer(baseUri, config);
    }
}
