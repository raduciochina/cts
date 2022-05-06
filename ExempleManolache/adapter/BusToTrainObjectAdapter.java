package ExempleManolache.adapter;

import cts.manolache.mihaiandrei.g1086.adapter.exceptions.NoSeatsAvailableException;

public class BusToTrainObjectAdapter extends TrainTicketBooking {
    BusTicketBooking busTicketBooking;

    public BusToTrainObjectAdapter(BusTicketBooking busTicketBooking) {
        this.busTicketBooking = busTicketBooking;
    }

    @Override
    public boolean reserveSeat(int row, int seat) {
        try {
            busTicketBooking.occupySeat();
            return true;
        } catch (NoSeatsAvailableException e) {
            e.printStackTrace();
            return false;
        }
    }
}
