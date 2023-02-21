package com.urtv.main.dto;

import com.urtv.main.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddMovieDto {
    @Size(min = 1,message = "Please enter movie name")
    private String movieName;
    @Size(min = 1,message = "Please enter movie poster link")
    private String bannerUrl;
    @Size(min = 1,message = "Please enter movie link")
    private String movieUrl;
    @Size(min = 1,message = "Please enter movie details")
    private String description;
    @Size(min = 1,message = "Please enter movie rating")
    private double rating;
    @Size(min = 1,message = "Please enter movie genre")
    private Genre genre;
    @Size(min = 1,message = "Please enter movie release date")
    private LocalDate releaseDate;
    @Size(min = 1,message = "Please enter movie country")
    private String country;
    private List<String> casts = new ArrayList<>();
    @Size(min = 1,message = "Please enter movie duration")
    private String duration;
}
