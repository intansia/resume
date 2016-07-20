package com.example.zxcvbn.resume_anita;
import retrofit.RestAdapter;
/**
 * Created by zxcvbn on 19/07/2016.
 */
public class RESTClient {
    private static APIResumeResult REST_CLIENT;
    private static String URL_INFORESUME="http://192.168.1.193/anita";
    static {
        //dieksekusi sebelum constructor, tapi hanya sekali untuk semua instans
        setupRestClient();
    }
    private RESTClient(){}
    public static APIResumeResult get(){
        return REST_CLIENT;
    }
    private static void setupRestClient(){
        RestAdapter builder=new RestAdapter.Builder().setEndpoint(URL_INFORESUME).build();
        REST_CLIENT=builder.create(APIResumeResult.class);
    }
}

