package com.nsbedfw.slackapp.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SlackResponse {
    private String text;
    private List attachments;
    private String response_type;
}
