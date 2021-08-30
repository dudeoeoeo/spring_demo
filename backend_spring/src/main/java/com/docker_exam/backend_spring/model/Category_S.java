package com.docker_exam.backend_spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
public class Category_S {

	@Id
	@Column(name = "CATEGORY_S_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	private Category category;

    @Column
	private String sort;
	
	@OneToMany(mappedBy = "category_S")
	List<Category_D> category_D_list = new ArrayList<>();
	
}
