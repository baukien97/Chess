package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.entity.PieceEntity;

@Service
public interface IPieceService {
    ArrayList<PieceEntity> findAll();
}
