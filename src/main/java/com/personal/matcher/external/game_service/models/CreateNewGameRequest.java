package com.personal.matcher.external.game_service.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateNewGameRequest {

    @JsonProperty("request-id")
    private String requestId;

    @JsonProperty("game_format")
    private String gameFormat;

    @JsonProperty("time_control")
    private String timeControl;

    @JsonProperty("user_info")
    private UserInfo userInfo;
}

