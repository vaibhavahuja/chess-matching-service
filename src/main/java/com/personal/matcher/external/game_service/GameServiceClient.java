package com.personal.matcher.external.game_service;

import com.personal.matcher.external.game_service.models.CreateNewGameRequest;
import com.personal.matcher.external.game_service.models.CreateNewGameResponse;
import com.personal.matcher.external.game_service.models.GetUserInfoResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GameServiceClient {

    @GET("/get-user-info/{user_id}")
    Call<GetUserInfoResponse> getUserInformationById(@Path("user_id") String userId);

    @POST("/create-new-game")
    Call<CreateNewGameResponse> createNewGame(CreateNewGameRequest request);
}
