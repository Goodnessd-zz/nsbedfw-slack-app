package com.nsbedfw.slackapp.services.slack;

import com.nsbedfw.slackapp.services.slack.SlackResponse.SlackResponseBuilder;
import com.nsbedfw.slackapp.services.trello.Event;
import com.nsbedfw.slackapp.services.trello.TrelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Component
public class SlackService {

    @Autowired
    TrelloService trelloService;

    public SlackResponse createResponse() {
        List<Event> events = trelloService.getEvents();

        List<Attachment> attachments = events.stream()
                .map(this::createAttachment)
                .collect(Collectors.toList());
        List<Attachment> firstFour = asList(attachments.get(0), attachments.get(1), attachments.get(3), attachments.get(4));
        return new SlackResponseBuilder().attachments(firstFour).build();
    }

    private Attachment createAttachment(Event event) {
        return Attachment.builder()
                .title(event.getEventName())
                .text(event.getEventDescription())
                .build();
    }
}
