package com.example.zxcvbn.resume_anita;
import retrofit.Callback;
import retrofit.http.POST;
/**
 * Created by zxcvbn on 19/07/2016.
 */
public interface APIResumeResult {
    @POST("/hasil")
    void getHasilResume(Callback<ResponseResume> callback);
}
