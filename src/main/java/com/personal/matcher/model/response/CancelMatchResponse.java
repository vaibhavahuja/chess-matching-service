package com.personal.matcher.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CancelMatchResponse {

    @JsonProperty("status_code")
    private Integer statusCode;

    private String error;
}
