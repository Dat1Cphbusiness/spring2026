package enumerations;

import java.time.LocalDate;

public class Ticket {

    int price;
    int zone;
    LocalDate date;
    TicketTypes type;

    public Ticket(int price, int zone, LocalDate date, TicketTypes type) {
        this.price = price;
        this.zone = zone;
        this.date = date;
        this.type = type;
    }




}
