package com.ysf.jpa.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName Dept
 * @Description Dept
 * @Author admin
 * @Date 2019/11/21 15:08
 */

@Entity
@Table(name = "DCM_BMS_DEPT")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Data
public class Dept {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    private String name;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;
    private String code;
    private String description;
    private Short evaluateflag;
    private String deptleader;
    private String phone;
    private String fax;
    private Short isDelete;
    private String team;
    private Short ordernum;
    private String handphone;
    private String issendmsg;
    private String othername;
    private Short worktype;
    private String isadmindept;
    private String otherid;
    private String otherurl;
    private Long otherxt;
}
