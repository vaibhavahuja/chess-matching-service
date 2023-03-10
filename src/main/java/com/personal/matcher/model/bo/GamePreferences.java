package com.personal.matcher.model.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GamePreferences {

    @JsonProperty("game_format")
    private String gameFormat;

    @JsonProperty("time_format")
    private String timeFormat;

    @JsonProperty("pieces")
    private String pieces;

    @JsonProperty("rating_diff_positive")
    private Integer ratingDiffPositive;

    @JsonProperty("rating_diff_negative")
    private Integer ratingDiffNegative;

}
