package potenday.backend.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import potenday.backend.domain.User;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserReader userReader;
    private final UserWriter userWriter;

    public User read(Long id) {
        return userReader.read(id);
    }

    public User update(Long id, String email, String username) {
        return userWriter.update(id, email, username);
    }

}
