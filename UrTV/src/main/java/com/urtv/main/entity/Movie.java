package com.urtv.main.entity;


import com.urtv.main.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

	private String duration;
	@ElementCollection
	private List<String> casts=new ArrayList<>();

}
