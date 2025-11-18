package ma.elamrani.dellunahotel.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * This class is used to receive the data sent by the frontend when the user tries to log in.
 *
 * It represents the request that the frontend sends to the backend during login.
 *
 * LoginRequest = request from the frontend → backend
 */
@Data
public class LoginRequest {

    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "Password is required")
    private String password;
}