package com.personal.matcher.external.game_service.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateNewGameResponse {

    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("error")
    private String error;
}

