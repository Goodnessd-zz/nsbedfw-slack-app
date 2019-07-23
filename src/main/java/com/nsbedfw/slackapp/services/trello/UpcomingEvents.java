package com.nsbedfw.slackapp.services.trello;

import lombok.Getter;

import java.util.Date;


@Getter
public class UpcomingEvents {
    private String id;
    private String desc;
    private String dueReminder;
    private String idBoard;
    private String idList;
    private String idAttachmentCover;
    private String manualCoverAttachment;
    private String name;
    private String pos;
    private String dueComplete;
    private Date due;
    private String url;
}