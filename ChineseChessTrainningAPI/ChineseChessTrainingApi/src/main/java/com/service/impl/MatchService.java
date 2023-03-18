package com.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.MatchEntity;
import com.repository.IMatchRepository;
import com.service.IMatchService;

@Service
public class MatchService implements IMatchService {

    @Autowired
    private IMatchRepository matchRepository;

    @Override
    public ArrayList<MatchEntity> findAll() {
        return matchRepository.findAll();
    }

    @Override
    public MatchEntity findParentMatchById(long id) {
        return matchRepository.findParentMatchById(id);
    }

    @Override
    public ArrayList<MatchEntity> findChildMatchesById(long id) {
        return matchRepository.findChildMatchesById(id);
    }
}
