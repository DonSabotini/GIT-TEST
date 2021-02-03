package com.itacademy.java.opp.basics;

public class TravelApplication {

    public static void main(String[] args) {
        Person john = new Person("John", "Lennon", Gender.MALE, 33);
        Person lily = new Person("Lily", "Lennon", Gender.FEMALE, 32);
        Person jim = new Person("Jim", "Smith", Gender.MALE, 22);
        Person sally = new Person("Sally", "Smith", Gender.FEMALE, 25);
        Vehicle veyron = new Vehicle("Veyron", "Bugatti", 12.0, 16.0);
        Vehicle prius = new Vehicle("Prius", "Toyota", 21.0, 3.0);
        TravelDestination italy = new TravelDestination("Italy","Rome",100.0);
        TravelDestination trakai = new TravelDestination("Lietuva","Trakai",12.0);
        Family lennon = new Family(new Person[]{john, lily},veyron,trakai);
        Family smith = new Family(new Person[]{jim, sally},prius,trakai);
        printFamilyMembers(lennon);
        System.out.println(lennon);
        System.out.println(smith);
        changeDestination(lennon,italy);
        System.out.println(lennon);
        travel(lennon);
        travel(smith);
    }
    public static Family changeDestination(Family family, TravelDestination destination){
        if(family.getTravelDestination() == destination)
            return family;
        else{
            family.setTravelDestination(destination);
            return family;
        }
    }
    public static void travel(Family family){
        double carTravelDistance = family.getVehicle().maxTravelDistance();
        double destination = family.getTravelDestination().getDistance();
        if(carTravelDistance >= destination)
            System.out.println("The family is able to travel to their destination");
        else{
            double distanceLeft =  destination - carTravelDistance;
            double fuelNeeded =  (family.getVehicle().getConsumption()*distanceLeft)/100;
            System.out.println("The family is not able to travel to their , they need " +fuelNeeded + " fuel");
        }
    }
    public static void printFamilyMembers(Family family){
        for(Person p : family.getPeople())
            System.out.println(p);
    }
}
