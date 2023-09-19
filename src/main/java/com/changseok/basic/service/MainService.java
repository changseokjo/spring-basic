package com.changseok.basic.service;

import org.springframework.http.ResponseEntity;

import com.changseok.basic.dto.request.PatchNicknameRequestDto;
import com.changseok.basic.dto.request.PostUserRequestDto;
import com.changseok.basic.dto.response.PatchNicknameResponseDto;
import com.changseok.basic.dto.response.PostUserResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto);
    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto);

}