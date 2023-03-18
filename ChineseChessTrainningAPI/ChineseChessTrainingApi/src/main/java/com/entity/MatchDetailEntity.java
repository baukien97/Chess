package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_match_detail")
public class MatchDetailEntity implements Serializable {

    @EmbeddedId
    private MatchDetailEntityKey id;

    @Column(name = "piece_id")
    private long pieceId;

    @Column(name = "current_col")
    private int curentCol;

    @Column(name = "current_row")
    private int curentRow;

    @Column(name = "next_col")
    private int nextCol;

    @Column(name = "next_row")
    private int nextRow;
}