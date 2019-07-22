package com.nsbedfw.slackapp.api;

import com.nsbedfw.slackapp.api.SlackResponse.SlackResponseBuilder;
import com.nsbedfw.slackapp.services.TrelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static java.util.Collections.singletonList;

@Service
@Path("/api")
public class MainController{

    @Autowired
    private TrelloService trelloService;

    @POST
    @Produces("application/json")
    public SlackResponse helloWorld() {
        String comingSoonString = "Hi! We are currently underway in planning the programming and intiatives " +
                "for the year. Check back soon for more information on how you can become involved with the chapter!";
        Attachment attachment = new Attachment("In the meantime, why not ask any of our E-board members. :)");
        trelloService.getBoard();
        return new SlackResponseBuilder().text(comingSoonString).attachments(singletonList(attachment)).build();
    }
}