package com.service;

import java.util.ArrayList;

import com.dto.MatchDetailDto;

public interface IMatchDetailService {

    ArrayList<MatchDetailDto> findByMatchId(long matchId);

}
