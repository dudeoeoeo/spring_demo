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
public class AD_click_log {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "AD_USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "AD_CATEGORY_D_ID")
	private Category_D category_D;

    @Column
    @CreatedDate
	private LocalDateTime view_date;
}
