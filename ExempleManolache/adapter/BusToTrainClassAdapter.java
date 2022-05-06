package ExempleManolache.adapter;

import cts.manolache.mihaiandrei.g1086.adapter.exceptions.NoSeatsAvailableException;

public class BusToTrainClassAdapter extends BusTicketBooking implements AbstractTrainTicketBooking{
    public BusToTrainClassAdapter(int nbOfSeats) {
        super(nbOfSeats);
    }

    @Override
    public boolean reserveSeat(int row, int seat) {
        try {
            super.occupySeat();
            return true;
        } catch (NoSeatsAvailableException e) {
            e.printStackTrace();
            return false;
        }
    }
}
