package org.example.Model;

import jakarta.persistence.*;


import java.math.BigDecimal;

@Entity
public class CountryLanguage {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    private Country country;  // La clase 'Country' debe estar definida

    @Id
    @Column(name = "Language", nullable = false, length = 30)
    private String language;

    @Column(name = "IsOfficial", nullable = false, length = 1)
    @Enumerated(EnumType.STRING)
    private OfficialStatus isOfficial;

    @Column(name = "Percentage", nullable = false, precision = 4, scale = 1)
    private BigDecimal percentage;

    // Getters y Setters

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public OfficialStatus getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(OfficialStatus isOfficial) {
        this.isOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}

