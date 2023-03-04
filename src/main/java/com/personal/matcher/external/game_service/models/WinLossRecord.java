package com.personal.matcher.external.game_service.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WinLossRecord {
    @JsonProperty("game_format")
    private String gameFormat;
    private Integer played;
    private Integer won;
    private Integer lost;
    private Integer abandoned;
    private Integer draw;
}

