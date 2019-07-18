package com.nsbedfw.slackapp.api;

import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/api")
public class MainController{

    @POST
    @Produces("text/plain")
    public SlackResponse helloWorld() {
        return new SlackResponse("hello World", new Attachment("woot!"), "ephemeral");
    }
}