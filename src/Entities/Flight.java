package Entities;

import java.util.Date;

public class Flight {
    private String FlightOrigin;
    private String FlightDestiny;
    private String date;
    private int price;

    public Flight(String flightOrigin, String flightDestiny, String date, int price) {
        FlightOrigin = flightOrigin;
        FlightDestiny = flightDestiny;
        this.date = date;
        this.price = price;
    }

    public String getFlightOrigin() {
        return FlightOrigin;
    }

    public void setFlightOrigin(String flightOrigin) {
        FlightOrigin = flightOrigin;
    }

    public String getFlightDestiny() {
        return FlightDestiny;
    }

    public void setFlightDestiny(String flightDestiny) {
        FlightDestiny = flightDestiny;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "FlightOrigin='" + FlightOrigin + '\'' +
                ", FlightDestiny='" + FlightDestiny + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }
}
