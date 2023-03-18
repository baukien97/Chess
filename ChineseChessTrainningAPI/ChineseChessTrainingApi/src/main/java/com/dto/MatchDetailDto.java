package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetailDto {
    private long matchId;

    private long turn;

    private long pieceId;

    private int curentCol;

    private int curentRow;

    private int nextCol;

    private int nextRow;
}
