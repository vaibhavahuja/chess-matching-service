package com.personal.matcher.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CancelMatchRequest {
    @JsonProperty("request_id")
    private String requestId;
}
