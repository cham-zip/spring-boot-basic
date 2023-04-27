package com.chaminju.board.service;

import org.springframework.http.ResponseEntity;

import com.chaminju.board.dto.request.board.PatchBoardRequestDto;
import com.chaminju.board.dto.request.board.PostBoardRequestDto;
import com.chaminju.board.dto.response.board.GetBoardResponseDto;
import com.chaminju.board.dto.response.board.GetBoardListResponseDto;
import com.chaminju.board.dto.response.ResponseDto;

public interface BoardService {
    public ResponseEntity<ResponseDto> postBoard(PostBoardRequestDto dto);
    public ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    public ResponseEntity<? super GetBoardListResponseDto> getBoardList();
    public ResponseEntity<? super GetBoardListResponseDto> getBoardTop3();
    public ResponseEntity<ResponseDto> patchBoard(PatchBoardRequestDto dto);
    public ResponseEntity<ResponseDto> deleteBoard(String userEmail, Integer boardNumber);
}
