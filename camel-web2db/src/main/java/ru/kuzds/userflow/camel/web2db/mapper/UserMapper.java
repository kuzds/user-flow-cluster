package ru.kuzds.userflow.camel.web2db.mapper;

import org.springframework.stereotype.Component;
import ru.kuzds.userflow.userservice.SaveUserRequest;
import ru.kuzds.userflow.userservice.SaveUserResponse;
import ru.kuzds.userflow.userservice.User;

@Component
public class UserMapper {

    public SaveUserResponse toSaveUserResponse(SaveUserRequest request) {
        SaveUserResponse response = new SaveUserResponse();
        response.setUser(request.getUser());
        return response;
    }

    public String toString(SaveUserRequest request) {
        return toString(request.getUser());
    }

    public String toString(User user) {
        return String.format("User{id=%d, email='%s', transferType=%s}", user.getId(), user.getEmail(), user.getTransferType());
    }
}

