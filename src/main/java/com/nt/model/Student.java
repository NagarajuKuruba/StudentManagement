package com.nt.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@EntityScan
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private long id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String group;
	@NotEmpty
	private static String clgName;
	
}
