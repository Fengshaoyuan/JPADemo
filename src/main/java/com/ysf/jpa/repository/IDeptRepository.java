package com.ysf.jpa.repository;

import com.ysf.jpa.jpa.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName IDeptRepository
 * @Description IDeptRepository
 * @Author admin
 * @Date 2019/11/21 16:48
 */
public interface IDeptRepository extends JpaRepository<Dept, Long> {
}
