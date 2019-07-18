package com.nsbedfw.slackapp.config;

import com.nsbedfw.slackapp.api.MainController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(MainController.class);
    }
}
