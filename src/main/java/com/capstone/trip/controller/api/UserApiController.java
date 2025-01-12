package com.capstone.trip.controller.api;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import com.capstone.trip.config.auth.PrincipalDetail;
import com.capstone.trip.domain.user.User;
import com.capstone.trip.dto.user.UserSaveRequestDto;
import com.capstone.trip.service.UserService;

@RequiredArgsConstructor
@RestController
public class UserApiController {

	private final UserService userService;

	/**
	 * 회원가입 API
	 */
	@PostMapping("/auth/api/v1/user")
	public Long save(@RequestBody UserSaveRequestDto userSaveRequestDto) {
		return userService.save(userSaveRequestDto.toEntity());
	}

	/**
	 * 회원수정 API
	 */
	@PutMapping("/api/v1/user")
	public Long update(@RequestBody User user, @AuthenticationPrincipal PrincipalDetail principalDetail) {
		userService.update(user, principalDetail);
		return user.getId();
	}

}
