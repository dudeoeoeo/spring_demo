package com.docker_exam.backend_spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
public class Grade {

	@Id
	@Column(name = "GRADE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column
	private String grade;
}
