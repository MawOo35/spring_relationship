package com.eg.RelationShip.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t_id;
	private String t_name;

}
