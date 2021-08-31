package com.docker_exam.backend_spring.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
public class Category_D {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORY_S_ID", nullable = false)
	private Category_S category_S;
	
	@ManyToOne
	@JoinColumn(name = "CATE_D_GRADE_ID")
	private Grade grade;

    @Column
	private String brand;

    @Column
	private String purpose;

    @Column
	private String cpu;

    @Column
	private String moniter_size;

    @Column
	private String memory;

    @Column
	private int price;

    @Column
	private int discount;

    @Column
	private int recommendation;

    @Column
    @CreatedDate
	private LocalDateTime regdate;
	
	
}
