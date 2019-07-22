package com.nsbedfw.slackapp.services;

import lombok.Getter;

@Getter
public class BoardApiResponse {
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
    private String due;
    private String url;
}