package com.personal.matcher.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.matcher.model.bo.GamePreferences;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindMatchRequest {
    @JsonProperty("request_id")
    private String requestId;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("preferences")
    private GamePreferences preferences;
}
