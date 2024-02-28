package com.syedwaqarul.tic_tac_toe;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyNetworkManager {

//    private static final String BASE_URL = "https://api.example.com/";
//    private final MyApi myApi;
//
//    public MyNetworkManager() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        myApi = retrofit.create(MyApi.class);
//    }
//
//    public void fetchData() {
//        Call<MyResponse> call = myApi.getData();
//        call.enqueue(new Callback<MyResponse>() {
//            @Override
//            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
//                // Handle the response
//            }
//
//            @Override
//            public void onFailure(Call<MyResponse> call, Throwable t) {
//                // Handle the failure
//            }
//        });
//    }
}
