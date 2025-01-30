package org.example.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Country {
    @Id
    @Column(length = 3)
    private String code;

    @Column(length = 52)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Continent continent;

    @Column(length = 26)
    private String region;
    @Column(precision = 10, scale = 2)
    private BigDecimal surfaceArea;
    @Column()
    private Short indepYear;
    @Column()
    private int population;
    @Column(precision = 3, scale = 1)
    private BigDecimal lifeExcectancy;
    @Column(precision = 10, scale = 2)
    private BigDecimal gnp;
    @Column(precision = 10, scale = 2)
    private BigDecimal gnpopld;
    @Column(length = 45)
    private String localName;
    @Column(length = 45)
    private String governmentForm;
    @Column(length = 60)
    private String headOfState;
    @Column
    private int capital;
    @Column(length = 2,nullable = false)
    private String code2;

    public Country() {
    }

    public Country(String code, String name, Continent continent, String region, BigDecimal surfaceArea, Short indepYear, int population, BigDecimal lifeExcectancy, BigDecimal gnp, BigDecimal gnpopld, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExcectancy = lifeExcectancy;
        this.gnp = gnp;
        this.gnpopld = gnpopld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getLifeExcectancy() {
        return lifeExcectancy;
    }

    public void setLifeExcectancy(BigDecimal lifeExcectancy) {
        this.lifeExcectancy = lifeExcectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpopld() {
        return gnpopld;
    }

    public void setGnpopld(BigDecimal gnpopld) {
        this.gnpopld = gnpopld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
