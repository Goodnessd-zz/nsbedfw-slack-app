package com.nsbedfw.slackapp.api;

import com.nsbedfw.slackapp.api.SlackResponse.SlackResponseBuilder;
import com.nsbedfw.slackapp.services.TrelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.singletonList;

@Service
@Path("/api")
public class MainController{

    @Autowired
    private TrelloService trelloService;

    @POST
    @Produces("application/json")
    public SlackResponse helloWorld() {
        String comingSoonString = "Hi! Here are the upcoming events";
        List<String> board = trelloService.getBoard();


        List<Attachment> attachments = board.stream().map(Attachment::new).collect(Collectors.toList());

        return new SlackResponseBuilder().text(comingSoonString).attachments(attachments).build();
    }
}