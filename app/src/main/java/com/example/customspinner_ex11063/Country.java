package com.example.customspinner_ex11063;

public class Country {
    private int flag;
    private String name;
    private String capital;
    private int population;

    public Country(int flag, String capital, String name, int population) {
        this.flag = flag;
        this.capital = capital;
        this.name = name;
        this.population = population;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
