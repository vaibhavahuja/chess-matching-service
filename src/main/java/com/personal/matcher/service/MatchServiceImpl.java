package com.personal.matcher.service;

import com.personal.matcher.model.request.FindMatchRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MatchServiceImpl implements MatchService {
    public static String hey = "HEYY";
    @Override
    public String findMatch(FindMatchRequest request) {
        //logic to come here
        return Strings.EMPTY;
    }

    @Override
    public String cancelMatch(String requestId){
        return Strings.EMPTY;
    }


}
