package com.example;
public class KakarikoRealEstateAgent {

    private String name;
    private String agencyName;
    private int experienceYears;
    private String specialty; // e.g., "Cottages", "Sheikah Homes"
    private int rupeesEarned; // Currency in the Zelda universe

    // Constructor
    public KakarikoRealEstateAgent(String name, String agencyName, int experienceYears, String specialty) {
        this.name = name;
        this.agencyName = agencyName;
        this.experienceYears = experienceYears;
        this.specialty = specialty;
        this.rupeesEarned = 0; // Start with 0 earnings
    }

    // Methods
    public void listProperty(String propertyName, int price) {
        System.out.println(name + " has listed the property '" + propertyName + "' for " + price + " rupees.");
    }

    public void sellProperty(String buyerName, int price) {
        System.out.println(name + " sold a property to " + buyerName + " for " + price + " rupees.");
        rupeesEarned += price;
    }

    public void offerDiscount(int discountAmount) {
        System.out.println(name + " is offering a discount of " + discountAmount + " rupees on the listed properties!");
    }

    public void printProfile() {
        System.out.println("Agent Profile:");
        System.out.println("Name: " + name);
        System.out.println("Agency: " + agencyName);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Specialty: " + specialty);
        System.out.println("Rupees Earned: " + rupeesEarned);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getRupeesEarned() {
        return rupeesEarned;
    }

    public void setRupeesEarned(int rupeesEarned) {
        this.rupeesEarned = rupeesEarned;
    }

    public static void main(String[] args) {
        KakarikoRealEstateAgent agent = new KakarikoRealEstateAgent("Impa's Apprentice", "Sheikah Realty", 5, "Sheikah-inspired architecture");

        agent.printProfile();
        agent.listProperty("Cozy Cottage", 500);
        agent.offerDiscount(50);
        agent.sellProperty("Link", 450);
        agent.printProfile();
    }
}