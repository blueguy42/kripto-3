package com.fsck.k9.retrofit.response;


public class DecryptVerifyResponse {
    private String plaintext;
    private String valid;

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

}