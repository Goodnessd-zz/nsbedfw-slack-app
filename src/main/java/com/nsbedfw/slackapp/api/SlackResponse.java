package com.nsbedfw.slackapp.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SlackResponse {
    private String text;
    private Attachment attachments;
    private String response_type;
}
