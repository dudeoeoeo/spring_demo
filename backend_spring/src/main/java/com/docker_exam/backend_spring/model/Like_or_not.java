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
public class Like_or_not {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "LIKE_USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "LIKE_CATEGORY_D_ID")
	private Category_D category_D;

    @Column
	private int like_cnt;

    @Column
	private int unlike_cnt;

    @Column
    @CreatedDate
	private LocalDateTime like_or_not_date;
}
