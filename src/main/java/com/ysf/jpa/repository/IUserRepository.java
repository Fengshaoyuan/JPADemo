package com.ysf.jpa.repository;

import com.ysf.jpa.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @ClassName IUserRepository
 * @Description IUserRepository
 * @Author admin
 * @Date 2019/11/21 15:19
 */
public interface IUserRepository extends JpaRepository<User, Long> {

    @Query(value = "select new User(u.id, u.name) from User u, Dept d where u.dept = d.id and d.name = :deptname and u.activation = '1'")
    List<User> findLeadUserByDeptName(String deptname);
}
