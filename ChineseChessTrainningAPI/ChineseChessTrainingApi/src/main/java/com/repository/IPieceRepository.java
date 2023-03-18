package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.PieceEntity;

public interface IPieceRepository extends JpaRepository<PieceEntity, Long> {

}
