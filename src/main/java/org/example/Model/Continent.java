package org.example.Model;

public enum Continent {
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    AFRICA("Africa"),
    OCEANIA("Oceania"),
    ANTARCTICA("Antarctica"),
    SOUTH_AMERICA("South America");

    private final String name;

    // Constructor para asignar el valor de cadena al enum
    Continent(String name) {
        this.name = name;
    }

    // Método para obtener el nombre del continente
    public String getName() {
        return this.name;
    }
}


