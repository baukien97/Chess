package com.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.MatchDetailDto;
import com.entity.MatchDetailEntity;
import com.repository.IMatchDetailRepository;
import com.service.IMatchDetailService;

@Service
public class MatchDetailService implements IMatchDetailService {

    @Autowired
    private IMatchDetailRepository matchDetailRepository;

    @Override
    public ArrayList<MatchDetailDto> findByMatchId(long matchId) {
        ArrayList<MatchDetailDto> matchDetailDtos = new ArrayList<>();
        for (MatchDetailEntity matchDetailEntity : matchDetailRepository.findByMatchId(matchId)) {
            matchDetailDtos.add(new MatchDetailDto(matchDetailEntity.getId().getMatchId(),
                    matchDetailEntity.getId().getTurn(), matchDetailEntity.getPieceId(),
                    matchDetailEntity.getCurentCol(), matchDetailEntity.getCurentRow(), matchDetailEntity.getNextCol(),
                    matchDetailEntity.getNextRow()));
        }
        return matchDetailDtos;
    }

}
