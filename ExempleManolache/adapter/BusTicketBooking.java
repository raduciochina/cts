package ExempleManolache.adapter;

import cts.manolache.mihaiandrei.g1086.adapter.exceptions.NoSeatsAvailableException;

public class BusTicketBooking {
    private int nbOfSeats;

    public BusTicketBooking (int nbOfSeats) {
        this.nbOfSeats = nbOfSeats;
    }

    public void occupySeat() throws NoSeatsAvailableException {
        if(nbOfSeats > 0) {
            nbOfSeats--;
        } else {
            throw new NoSeatsAvailableException();
        }
    }
}
