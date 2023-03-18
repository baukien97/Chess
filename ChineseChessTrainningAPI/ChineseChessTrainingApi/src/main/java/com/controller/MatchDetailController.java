package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.MatchDetailDto;
import com.service.IMatchDetailService;

@RestController
@RequestMapping("/api")
public class MatchDetailController {
    @Autowired
    private IMatchDetailService matchDetailService;

    @GetMapping("/match/{matchId}/details")
    public ResponseEntity<ArrayList<MatchDetailDto>> findByMatchId(@PathVariable long matchId) {
        return new ResponseEntity<>(matchDetailService.findByMatchId(matchId), HttpStatus.OK);
    }

}
