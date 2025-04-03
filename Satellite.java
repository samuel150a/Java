class Satellites {
    String name;
    String country;
    String type;
    int launchYear;
    boolean isOperational;
    int orbitHeight;
    String orbitType;
    boolean isMilitary;
    int weight;
    int lifespan;
    String manufacturer;
    boolean hasSolarPanels;
    int communicationBands;
    boolean isGeoStationary;
    boolean usedForWeatherMonitoring;
    boolean usedForNavigation;
    boolean usedForResearch;
    boolean usedForEarthObservation;
    String launchVehicle;
    String launchSite;

    public Satellites(String name, String country, String type, int launchYear, boolean isOperational, int orbitHeight, 
                     String orbitType, boolean isMilitary, int weight, int lifespan, String manufacturer, 
                     boolean hasSolarPanels, int communicationBands, boolean isGeoStationary, boolean usedForWeatherMonitoring, 
                     boolean usedForNavigation, boolean usedForResearch, boolean usedForEarthObservation, 
                     String launchVehicle, String launchSite) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.launchYear = launchYear;
        this.isOperational = isOperational;
        this.orbitHeight = orbitHeight;
        this.orbitType = orbitType;
        this.isMilitary = isMilitary;
        this.weight = weight;
        this.lifespan = lifespan;
        this.manufacturer = manufacturer;
        this.hasSolarPanels = hasSolarPanels;
        this.communicationBands = communicationBands;
        this.isGeoStationary = isGeoStationary;
        this.usedForWeatherMonitoring = usedForWeatherMonitoring;
        this.usedForNavigation = usedForNavigation;
        this.usedForResearch = usedForResearch;
        this.usedForEarthObservation = usedForEarthObservation;
        this.launchVehicle = launchVehicle;
        this.launchSite = launchSite;
    }

    public void display() {
        System.out.println("Satellite Name is"+name);
        System.out.println("Country is"+country);
        System.out.println("Type is"+type);
        System.out.println("Launch Year is"+launchYear);
        System.out.println("Is Operational is"+isOperational);
        System.out.println("Orbit Height is"+orbitHeight);
        System.out.println("Orbit Type is"+orbitType);
        System.out.println("Is Military is"+isMilitary);
        System.out.println("Weight is"+weight);
        System.out.println("Lifespan is" +lifespan);
        System.out.println("Manufacturer is"+manufacturer);
        System.out.println("Has Solar Panels is"+hasSolarPanels);
        System.out.println("Communication Bands is"+communicationBands);
        System.out.println("Is Geostationary is"+isGeoStationary);
        System.out.println("Used for Weather Monitoring is"+usedForWeatherMonitoring);
        System.out.println("Used for Navigation is"+usedForNavigation);
        System.out.println("Used for Research is"+usedForResearch);
        System.out.println("Used for Earth Observation is"+usedForEarthObservation);
        System.out.println("Launch Vehicle is"+launchVehicle);
        System.out.println("Launch Site is"+launchSite);
        System.out.println("\n");
    }
}
