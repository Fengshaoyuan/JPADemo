package com.ysf.jpa.repository;

import com.ysf.jpa.jpa.SB;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISBRepository extends JpaRepository<SB, Long> {

    //查询
    SB findById(String id);

    List<SB> findAllByX(String x);

    List<SB> findAllByOrderBySbTimeDesc();

    List<SB> findAllByOrderBySbTime();

    List<SB> findAllByXAndY(String x, String y);
    //分页
    Page<SB> findAll(Pageable pageable);
}
