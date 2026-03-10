package enumerations;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(25, 1, LocalDate.now(), TicketTypes.CHILD);
     //   Ticket ticket2 = new Ticket(25, 1, LocalDate.now(), "child");
     //   Ticket ticket3 = new Ticket(25, 1, LocalDate.now(), "Kids");
    }
}
