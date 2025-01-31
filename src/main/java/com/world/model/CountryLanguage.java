package com.world.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class CountryLanguage {

    @EmbeddedId
    CountryLanguageId id;

    @ManyToOne
    @MapsId("countryCode") // Mapea la clave compuesta con el campo countryCode
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Enumerated(EnumType.STRING)
    private IsOfficial isOfficial;

    @Column(precision = 4, scale = 1)
    private BigDecimal percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguageId id, Country country, IsOfficial isOfficial, BigDecimal percentage) {
        this.id = id;
        this.country = country;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public IsOfficial getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(IsOfficial isOfficial) {
        this.isOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                 id +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }
}
