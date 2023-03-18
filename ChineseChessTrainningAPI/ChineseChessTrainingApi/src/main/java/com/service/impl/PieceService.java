package com.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.PieceEntity;
import com.repository.IPieceRepository;
import com.service.IPieceService;

@Service
public class PieceService implements IPieceService {

    @Autowired
    private IPieceRepository pieceRepository;

    @Override
    public ArrayList<PieceEntity> findAll() {
        return (ArrayList<PieceEntity>) pieceRepository.findAll();
    }

}
