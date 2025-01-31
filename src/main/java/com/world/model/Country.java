package com.world.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {

    @Id
    @Column(length = 3, name = "Code")
    private String code;

    @Column(length = 52, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Continent continent;

    @Column(length = 26, nullable = false)
    private String region;

    @Column(scale = 10,precision = 2,nullable = false)
    private BigDecimal surfaceArea;

    private Short indepYear;

    @Column(nullable = false)
    private int population;

    @Column(scale = 3,precision = 1)
    private BigDecimal lifeExpectancy;

    @Column(scale = 10,precision = 2)
    private BigDecimal gnp;

    @Column(scale = 10,precision = 2)
    private BigDecimal gnpold;

    @Column(length = 45, nullable = false)
    private String localName;

    @Column(length = 45, nullable = false)
    private String governmentForm;

    @Column(length = 60)
    private String headOfState;

    private Integer capital;

    @Column(length = 2,nullable = false)
    private String code2;

    @OneToMany(mappedBy = "country")
    private Set<CountryLanguage> languages = new HashSet<CountryLanguage>();

    public Country() {
    }

    public Country(String code, String name, Continent continent, String region, BigDecimal surfaceArea, Short indepYear, int population, BigDecimal lifeExpectancy, BigDecimal gnp, BigDecimal gnpold, String localName, String governmentForm, String headOfState, Integer capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpold = gnpold;
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

    public void setIndepYear(short indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpold() {
        return gnpold;
    }

    public void setGnpold(BigDecimal gnpold) {
        this.gnpold = gnpold;
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

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent=" + continent +
                ", region='" + region + '\'' + "\n......" +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population + "\n......" +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpold=" + gnpold +
                ", localName='" + localName + '\'' + "\n......" +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' + "\n......" +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
