package com.ysf.jpa.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName User
 * @Description User
 * @Author admin
 * @Date 2019/11/21 14:59
 */
@Entity
@Table(name = "DCM_BMS_USER")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Data
public class User {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    private String logonname;
    private String dept;
    private String password;
    private String name;
    private String grade;
    private String serialnumber;
    private String phone;
    private String email;
    private String mobilephone;
    private String lead;
    private String position;
    private String otherdept;
    private String activation;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;
    private String jobposition;
    private String photo;
    private String isstation;
    private String hjuserid;
    private String edu;
    private String isxj;
    private String isjg;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
