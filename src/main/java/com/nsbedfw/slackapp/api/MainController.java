package com.nsbedfw.slackapp.api;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/api")
public class MainController{

    @GET
    @Produces("text/plain")
    public String helloWorld() {
        return "Hello World";
    }
}