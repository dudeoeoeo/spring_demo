package com.docker_exam.backend_spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
public class Category {

	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column
	private String category;
	
	@OneToMany(mappedBy = "category")
	List<Category_S> category_S_list = new ArrayList<>();
}
