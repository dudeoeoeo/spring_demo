package com.docker_exam.backend_spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

@Setter
@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "USERS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String user_id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String birth;
    
    @Column
    private String phone;
    
    @ManyToOne
    @JoinColumn(name = "GRADE_ID")
    private Grade grade;

    @Column
    @CreatedDate
    private LocalDateTime user_grade_reg;

    @Column
    @CreatedDate
    private LocalDateTime regdate;
}
