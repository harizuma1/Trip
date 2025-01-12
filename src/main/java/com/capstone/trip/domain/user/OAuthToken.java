package com.capstone.trip.domain.user;

import lombok.Data;

@Data
public class OAuthToken {
	private String access_token;
	private String token_type;
	private String refresh_token;
	private String expires_in;
	private String scope;
	private int refresh_token_expires_in;
}
