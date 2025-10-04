package ma.elamrani.dellunahotel.service.interfaces;


import ma.elamrani.dellunahotel.dto.LoginRequest;
import ma.elamrani.dellunahotel.dto.Response;
import ma.elamrani.dellunahotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}