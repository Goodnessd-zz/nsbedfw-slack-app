package com.nsbedfw.slackapp.api;

import com.nsbedfw.slackapp.services.slack.SlackResponse;
import com.nsbedfw.slackapp.services.slack.SlackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Service
@Path("/api")
public class MainController{
    @Autowired
    SlackService slackService;

    @POST
    @Produces("application/json")
    public SlackResponse getEvents() {
        SlackResponse response = slackService.createResponse();
        return response;
    }
}