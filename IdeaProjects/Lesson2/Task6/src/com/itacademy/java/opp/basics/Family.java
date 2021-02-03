package com.itacademy.java.opp.basics;

import java.util.Arrays;

public class Family {
    private Person people[];
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public void setTravelDestination(TravelDestination travelDestination) {
        this.travelDestination = travelDestination;
    }



    public Person[] getPeople() {
        return people;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    public Family(Person[] people, Vehicle vehicle, TravelDestination travelDestination) {
        this.people = people;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    @Override
    public String toString() {
        return "Family{" +
                "people=" + Arrays.toString(people) +
                ", vehicle=" + vehicle +
                ", travelDestination=" + travelDestination +
                '}';
    }
}
