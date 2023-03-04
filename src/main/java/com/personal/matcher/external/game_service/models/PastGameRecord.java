package com.personal.matcher.external.game_service.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PastGameRecord {

    @JsonProperty("game_format")
    private String gameFormat;

    private WinLossRecord record;
}

