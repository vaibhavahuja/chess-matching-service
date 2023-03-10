package com.personal.matcher.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindMatchResponse {

    @JsonProperty("status_code")
    private Integer statusCode;

    private String message;

    private String error;
}
