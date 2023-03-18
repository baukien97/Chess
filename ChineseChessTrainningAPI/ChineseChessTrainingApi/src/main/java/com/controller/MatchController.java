package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.IMatchService;
import com.entity.MatchEntity;

@RestController
@RequestMapping("/api")
public class MatchController {
        @Autowired
        private IMatchService matchService;

        @GetMapping("/matches")
        public ResponseEntity<ArrayList<MatchEntity>> findAll() {
                return new ResponseEntity<>(matchService.findAll(), HttpStatus.OK);
        }

        @GetMapping("/match/{id}/parent")
        public ResponseEntity<MatchEntity> findParentMatchById(@PathVariable("id") long id) {
                return new ResponseEntity<>(matchService
                                .findParentMatchById(id), HttpStatus.OK);
        }

        @GetMapping("/match/{id}/children")
        public ResponseEntity<ArrayList<MatchEntity>> findChildMatchesById(@PathVariable("id") long id) {
                return new ResponseEntity<>(matchService
                                .findChildMatchesById(id), HttpStatus.OK);
        }
}
