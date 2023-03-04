package com.personal.matcher.external.game_service;

import com.personal.matcher.external.game_service.models.CreateNewGameRequest;
import com.personal.matcher.external.game_service.models.CreateNewGameResponse;
import com.personal.matcher.external.game_service.models.GetUserInfoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;


@Service
@Slf4j
public class GameServiceClientService {
    @Autowired
    private GameServiceClient gameServiceClient;

    public GetUserInfoResponse getUserInfoById(String userId) throws Exception {
        try {
            Response<GetUserInfoResponse> gameServiceResponse = gameServiceClient.getUserInformationById(userId).execute();
            if (gameServiceResponse.isSuccessful()) {
                return gameServiceResponse.body();
            } else {
                throw new Exception("Client Exception while fetching information for user Id" + userId);
            }
        } catch (Exception e) {
            log.error("Exception while fetching user info by id ", e);
            throw new Exception(e.getMessage());
        }
    }

    public CreateNewGameResponse createNewGame(CreateNewGameRequest request) throws Exception {
        try {
            Response<CreateNewGameResponse> gameServiceResponse = gameServiceClient.createNewGame(request).execute();
            if (gameServiceResponse.isSuccessful()) {
                return gameServiceResponse.body();
            } else {
                throw new Exception("Client Exception while creating new game with request" + request);
            }
        } catch (Exception e) {
            log.error("Exception while creating new game ", e);
            throw new Exception(e.getMessage());
        }
    }

}
