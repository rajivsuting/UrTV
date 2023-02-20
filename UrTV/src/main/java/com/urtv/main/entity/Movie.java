package com.urtv.main.entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.urtv.main.enums.Genre;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private String movieName;
	
	private String bannerUrl;
	
	private String movieUrl;
	
	private String description;
	
	private double rating;
	
	private Genre genre;
	
	private LocalDate releaseDate;
	
	private String country;
	
	private List<String> cast = new ArrayList<>();
	
	private String duration;
	
	

}
