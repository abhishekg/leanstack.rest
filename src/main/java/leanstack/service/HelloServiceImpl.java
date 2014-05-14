package leanstack.service;

public class HelloServiceImpl implements HelloService {

    @Override
    public Greeting getGreeting() {
        System.out.println( "Requested to getGreeting()" );
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello World from service");
        return greeting;
    }
}
