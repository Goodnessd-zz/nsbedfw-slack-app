package com.nsbedfw.slackapp.services.trello;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class Event {
    private String eventName;
    private Date eventDate;
    private String eventDescription;
}
