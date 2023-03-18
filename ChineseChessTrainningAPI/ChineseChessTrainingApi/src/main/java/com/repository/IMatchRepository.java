package com.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.MatchEntity;

public interface IMatchRepository extends JpaRepository<MatchEntity, Long> {

    @Query(value = "select * from tbl_match where id = match_id", nativeQuery = true)
    ArrayList<MatchEntity> findAll();

    @Query(value = "select * from tbl_match as parent where parent.id = (select child.match_id from tbl_match as child where child.id = :id) and parent.id != :id", nativeQuery = true)
    MatchEntity findParentMatchById(@Param("id") long id);

    @Query(value = "select * from tbl_match as child where child.match_id = (select parent.id from tbl_match as parent where parent.id = :id) and child.id != child.match_id", nativeQuery = true)
    ArrayList<MatchEntity> findChildMatchesById(@Param("id") long id);

}
