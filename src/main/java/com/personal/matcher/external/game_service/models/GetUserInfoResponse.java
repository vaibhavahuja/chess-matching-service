package com.personal.matcher.external.game_service.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserInfoResponse {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("rating")
    private List<Rating> ratingList;

    @JsonProperty("past_game_record")
    private List<PastGameRecord> pastGameRecordList;
}

