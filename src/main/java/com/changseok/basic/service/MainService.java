package com.changseok.basic.service;

import org.springframework.http.ResponseEntity;

import com.changseok.basic.dto.request.PatchNicknameRequestDto;
import com.changseok.basic.dto.request.PostUserRequestDto;
import com.changseok.basic.dto.request.SignInRequestDto;
import com.changseok.basic.dto.response.PatchNicknameResponseDto;
import com.changseok.basic.dto.response.PostUserResponseDto;
import com.changseok.basic.dto.response.SignInResponseDto;
import com.changseok.basic.dto.response.DeleteUserResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity<? super PostUserResponseDto> postUser(PostUserRequestDto dto);
    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto);
    ResponseEntity<? super DeleteUserResponseDto> deleteUser(String email);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);

}