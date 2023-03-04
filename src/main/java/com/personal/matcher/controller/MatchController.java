package com.personal.matcher.controller;

import com.personal.matcher.constants.Constants;
import com.personal.matcher.model.request.CancelMatchRequest;
import com.personal.matcher.model.request.FindMatchRequest;
import com.personal.matcher.model.response.CancelMatchResponse;
import com.personal.matcher.model.response.FindMatchResponse;
import com.personal.matcher.service.MatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @RequestMapping(value = "/api/v1/find-match", method = RequestMethod.POST)
    public FindMatchResponse findMatch(@RequestBody FindMatchRequest request) {
        log.info("Received request to find match. request: {}", request);
        try {
            String message = matchService.findMatch(request);
            return FindMatchResponse.builder()
                    .statusCode(Constants.SUCCESS_STATUS_CODE)
                    .message(message)
                    .build();

        } catch (Exception e) {
            return FindMatchResponse.builder()
                    .statusCode(Constants.FAILURE_STATUS_CODE)
                    .error(e.getMessage())
                    .build();
        }
    }

    @RequestMapping(value = "/api/v1/cancel-request", method = RequestMethod.POST)
    public CancelMatchResponse cancelMatch(@RequestBody CancelMatchRequest request) {
        log.info("Received request to cancel match request : {}", request);
        try {
            matchService.cancelMatch(request.getRequestId());
            return CancelMatchResponse.builder()
                    .statusCode(Constants.SUCCESS_STATUS_CODE)
                    .build();
        } catch (Exception e) {
            return CancelMatchResponse.builder()
                    .statusCode(Constants.FAILURE_STATUS_CODE)
                    .error(e.getMessage())
                    .build();
        }
    }
}
