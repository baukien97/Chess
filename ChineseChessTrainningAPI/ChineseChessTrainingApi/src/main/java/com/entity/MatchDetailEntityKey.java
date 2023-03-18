package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MatchDetailEntityKey implements Serializable {
    @Column(name = "match_id")
    private long matchId;

    @Column(name = "turn")
    private long turn;

}
