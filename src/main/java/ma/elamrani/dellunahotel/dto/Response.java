package ma.elamrani.dellunahotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * This class is a Data Transfer Object (DTO) used to send consistent responses
 * from my Spring Boot backend to the frontend (React).
 *
 * It serves as a standardized structure for all JSON responses from my API.
 *
 * Response = response from the backend → frontend
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;

    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmationCode;

    private UserDTO user;
    private RoomDTO room;
    private BookingDTO booking;
    private List<UserDTO> userList;
    private List<RoomDTO> roomList;
    private List<BookingDTO> bookingList;


}