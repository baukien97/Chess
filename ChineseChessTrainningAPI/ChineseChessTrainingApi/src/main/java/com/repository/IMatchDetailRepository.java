package com.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.MatchDetailEntity;

public interface IMatchDetailRepository extends JpaRepository<MatchDetailEntity, Long> {

        @Query(value = "select * from tbl_match_detail"
                        + " where match_id = :matchId", nativeQuery = true)
        ArrayList<MatchDetailEntity> findByMatchId(@Param("matchId") long matchId);
}
