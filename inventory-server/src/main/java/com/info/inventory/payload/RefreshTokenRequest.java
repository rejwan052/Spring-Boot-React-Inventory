package com.info.inventory.payload;

import javax.validation.constraints.NotBlank;

public class RefreshTokenRequest {

	@NotBlank
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    
}
