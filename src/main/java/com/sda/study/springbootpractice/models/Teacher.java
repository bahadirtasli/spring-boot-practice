package com.sda.study.springbootpractice.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Bahadir Tasli
 * @Date 3/20/2023
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Teacher extends Auditable <String> implements Serializable /*Java.io*/ {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Course> specializedCourses;

    private boolean isActive;


}
