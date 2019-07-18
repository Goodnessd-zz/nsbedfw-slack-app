package com.nsbedfw.slackapp.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SlackResponse {
    private String text;
    private Attachment attachment;
    private String response_type;
}
