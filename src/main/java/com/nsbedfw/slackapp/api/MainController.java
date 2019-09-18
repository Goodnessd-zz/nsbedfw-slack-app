package com.nsbedfw.slackapp.api;

import com.nsbedfw.slackapp.services.slack.SlackResponse;
import com.nsbedfw.slackapp.services.slack.SlackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Service
@Path("/api")
public class MainController{
    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    SlackService slackService;

    @POST
    @Consumes(APPLICATION_FORM_URLENCODED)
    @Produces(APPLICATION_JSON)
    public SlackResponse getEvents(@FormParam("text") String text) {
        log.info("slackSlashCommand: {}", text);
        SlackResponse response = slackService.createResponse(text);
        return response;
    }
}