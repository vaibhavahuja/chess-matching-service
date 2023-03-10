package com.personal.matcher.service;

import com.personal.matcher.dao.MatchMakerRequestsRepository;
import com.personal.matcher.model.request.FindMatchRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MatchServiceImpl implements MatchService {
//    @Autowired
//    private StringRedisTemplate redisTemplate;

//    @Autowired
//    private MatchMakerRequestsRepository matchMakerRequestsRepository;

    @Override
    public String findMatch(FindMatchRequest request) {
        return Strings.EMPTY;
    }

    @Override
    public String cancelMatch(String requestId){
        return Strings.EMPTY;
    }


}
