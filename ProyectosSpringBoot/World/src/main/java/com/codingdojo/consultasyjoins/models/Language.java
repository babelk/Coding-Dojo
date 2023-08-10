package com.codingdojo.consultasyjoins.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "CHAR(3)")
    private String countryCode;
    @Column(columnDefinition = "CHAR(30)")
    private String language;
	@Column(columnDefinition = "ENUM('T','F')")
    private String isOfficial;
	@Column(columnDefinition = "FLOAT(4,1)")
    private Double percentage;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    // Getters and Setters
    

	public Integer getId() {
		return id;
	}

	public Language() {
		super();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsOfficial() {
		return isOfficial;
	}

	public void setIsOfficial(String isOfficial) {
		this.isOfficial = isOfficial;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}