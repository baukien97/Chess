package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.PieceEntity;
import com.service.IPieceService;

@RestController
@RequestMapping("/api")
public class PieceController {
    @Autowired
    private IPieceService pieceService;

    @GetMapping("/pieces")
    public ResponseEntity<ArrayList<PieceEntity>> findAll() {
        return new ResponseEntity<>(pieceService.findAll(), HttpStatus.OK);
    }

}
