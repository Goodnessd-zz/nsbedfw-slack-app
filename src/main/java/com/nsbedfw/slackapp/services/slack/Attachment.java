package com.nsbedfw.slackapp.services.slack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Attachment {
    private String Color;
    private String title;
    private String title_link;
    private String text;
    private String ts;
}
