package com.fsck.k9.retrofit.response;


public class KeyResponse {
    private String privateKey;
    private String publicKey;

    String getPrivateKey() {
        return privateKey;
    }

    void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    String getPublicKey() {
        return publicKey;
    }

    void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
