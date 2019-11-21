package com.ysf.jpa.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName SB
 * @Description DCM_BJGX_SB
 * @Author admin
 * @Date 2019/11/21 10:27
 */
@Entity
@Table(name = "DCM_BJGX_SB")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Data
public class SB {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "ID", unique = true, nullable = false)
    private String id;
    private String title;
    private String x;
    private String y;
    private String taskId;
    private Date sbTime;
    private String bz;
    private String adminId;
    private String adminName;
    private String state;
    private String description;
    private String fieldIntro;
}
