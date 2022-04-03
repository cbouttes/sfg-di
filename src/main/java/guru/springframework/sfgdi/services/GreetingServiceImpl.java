package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl {

    public String greeting() {
        return ("Hello World Injection par constructor !");
    }

}
