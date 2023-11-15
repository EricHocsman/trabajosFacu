package Entities;

import java.util.List;

public class Client extends Flight {

    // nombre, apellido, email, número de teléfono, origen de
    // partida, destino, fecha de partida y la opción de tarifa más económica o con menor cantidad de trasbordo.

    private List<Flight> availableFlight;

    public Client(String flightOrigin, String flightDestiny, String date, int price, List<Flight> availableFlight, String name, String surname, String email, int phoneNumber, Flight flight) {
        super(flightOrigin, flightDestiny, date, price);
        this.availableFlight = availableFlight;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.flight = flight;
    }

    private void addFlight(Flight flight) {
       this.availableFlight.add(flight);
    }

    private String name;
    private String surname;
    private String email;
    private int phoneNumber;

    private Flight flight;


    public List<Flight> getAvailableFlight() {
        return availableFlight;
    }

    public void setAvailableFlight(List<Flight> availableFlight) {
        this.availableFlight = availableFlight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Client{" +
                "availableFlight=" + availableFlight +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", flight=" + flight +
                '}';
    }
}

