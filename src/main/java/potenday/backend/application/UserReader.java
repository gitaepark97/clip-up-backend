package potenday.backend.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import potenday.backend.domain.User;
import potenday.backend.domain.repository.UserRepository;
import potenday.backend.support.ErrorCode;

@RequiredArgsConstructor
@Component
class UserReader {

    private final UserRepository userRepository;

    User read(String id) {
        return userRepository.findById(id).orElseThrow(ErrorCode.USER_NOT_FOUNDED::toException);
    }

}
