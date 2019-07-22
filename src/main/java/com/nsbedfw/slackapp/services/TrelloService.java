package com.nsbedfw.slackapp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static org.springframework.http.HttpMethod.GET;

@Component
public class TrelloService {
    RestTemplate restTemplate = new RestTemplate();

    @Value("${TRELLO_API_KEY}")
    private String key;

    @Value("${TRELLO_TOKEN_VALUE}")
    private String token;

    @Value("${UPCOMING_EVENTS}")
    private String id;

    public void getBoard(){
        String url = String.format("https://api.trello.com/1/lists/%s/cards?key=%s&token=%s",id,key,token);
        ResponseEntity<List<BoardApiResponse>> response = restTemplate.exchange(url, GET, null, new ParameterizedTypeReference<List<BoardApiResponse>>() {
        });

        List<String> cardNames = Objects.requireNonNull(response.getBody()).stream().map(BoardApiResponse::getName).collect(toList());
        cardNames.forEach(System.out::println);
    }
}
