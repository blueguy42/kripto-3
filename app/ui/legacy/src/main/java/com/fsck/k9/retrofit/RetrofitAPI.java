package com.fsck.k9.retrofit;


import com.fsck.k9.retrofit.response.DecryptResponse;
import com.fsck.k9.retrofit.response.EncryptResponse;
import com.fsck.k9.retrofit.response.KeyResponse;
import com.fsck.k9.retrofit.response.SignResponse;
import com.fsck.k9.retrofit.response.VerifyResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RetrofitAPI {

    @GET("/api/key/generateKey")
    Call<KeyResponse> generateKey();

    @POST("/api/key/sign")
    @FormUrlEncoded
    Call<SignResponse> sign(@Field("message") String message,
        @Field("privateKey") String privateKey);

    @POST("/api/key/verify")
    @FormUrlEncoded
    Call<VerifyResponse> verify(@Field("signedText") String signedText,
        @Field("publicKey") String publicKey);

    @POST("/api/key/encrypt")
    @FormUrlEncoded
    Call<EncryptResponse> encrypt(@Field("plaintext") String plaintext,
        @Field("symmetricKey") String symmetricKey);

    @POST("/api/key/decrypt")
    @FormUrlEncoded
    Call<DecryptResponse> decrypt(@Field("ciphertext") String ciphertext,
        @Field("symmetricKey") String symmetricKey);
}
