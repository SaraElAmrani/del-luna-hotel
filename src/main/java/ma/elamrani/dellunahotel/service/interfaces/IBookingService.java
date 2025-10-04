package ma.elamrani.dellunahotel.service.interfaces;


import ma.elamrani.dellunahotel.dto.Response;
import ma.elamrani.dellunahotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}