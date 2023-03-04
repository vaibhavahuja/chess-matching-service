package com.personal.matcher.service;

import com.personal.matcher.model.request.FindMatchRequest;

public interface MatchService {
    String findMatch(FindMatchRequest request);

    String cancelMatch(String requestId);
}
