package potenday.backend.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import potenday.backend.domain.LoginInfo;
import potenday.backend.domain.LoginMethod;

import java.util.Optional;

@Repository
public interface LoginInfoRepository extends JpaRepository<LoginInfo, Long> {

    Optional<LoginInfo> findByUserIdAndMethod(Long userId, LoginMethod method);

    Optional<LoginInfo> findByMethodAndLoginKey(LoginMethod method, String loginKey);

}
