package com.eoi.gamescarla.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eoi.gamescarla.entities.Game;

@Entity //IndicaaSpringyJPAqueesunaentidad
@Table(name="games") //"Mapea"elnombredelatabla 

public class Game implements Serializable{

	@Id //ClaveprimariayautogeneradaenMySQL
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	// propiedaid (campo id de la tabla category)
	//Columnaname,VARCHAR(100),NOT NULL

	@Column(name="title",length=150,nullable=false)
	private String title; // propiedad nombre (campo name de la tabla category)
	@Column(name="studio",length=50,nullable=false)
	private String studio;
	@Column(name="descr",length=500,nullable=true)
	private String descr;
	@Column(name="imageUrl",nullable=false)
	private String imageUrl;
	@Column(name="releaseDate",nullable=false)
	private Date releaseDate;
	@Column(name="rating",nullable=false)
	private double rating;
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public Game() {
		super();
	}
	public Game(Long id, String titulo) {
		super();
		this.id = id;
		this.title = titulo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String titulo) {
		this.title = titulo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id) && Objects.equals(title, other.title) && Objects.equals(studio, other.studio) && Objects.equals(descr, other.descr) && Objects.equals(imageUrl, other.imageUrl) && Objects.equals(releaseDate, other.releaseDate) && Objects.equals(rating, other.rating);
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", titulo=" + title + ", studio=" + studio + ", descr=" +  descr + ", imageUrl=" + imageUrl + ", releaseDate=" + releaseDate + ", rating= " + rating + " ]";
	}
}
