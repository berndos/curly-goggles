package io.berndos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/goggles")
public class MyRestController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Goggles> getGoggles(){
        return Arrays.asList(new Goggles(true), new Goggles(false));
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyRestController.class, args);
    }

}