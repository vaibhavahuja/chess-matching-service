package com.personal.matcher.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.matcher.model.entity.GamePreferences;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class FindMatchRequest {
    @JsonProperty("request_id")
    private String requestId;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("preferences")
    private GamePreferences preferences;
}
