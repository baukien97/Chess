package com.service;

import java.util.ArrayList;

import com.entity.MatchEntity;

public interface IMatchService {
    ArrayList<MatchEntity> findAll();

    MatchEntity findParentMatchById(long id);

    ArrayList<MatchEntity> findChildMatchesById(long id);

}
