package com.personal.matcher.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.matcher.model.entity.GamePreferences;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CancelMatchRequest {
    @JsonProperty("request_id")
    private String requestId;
}
