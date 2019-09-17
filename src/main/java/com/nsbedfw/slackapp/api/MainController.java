package com.nsbedfw.slackapp.api;

import com.nsbedfw.slackapp.services.slack.SlackResponse;
import com.nsbedfw.slackapp.services.slack.SlackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
    public SlackResponse getEvents(@RequestParam SlackRequestPayload request) {
        SlackResponse response = slackService.createResponse(request.getText());
        return response;
    }
}