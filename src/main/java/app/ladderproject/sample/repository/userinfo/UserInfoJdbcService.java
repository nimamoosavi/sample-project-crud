package app.ladderproject.sample.repository.userinfo;

import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import app.ladderproject.sample.domain.entity.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserInfoJdbcService extends JdbcServiceImpl<UserInfo, Long> {
    private final UserInfoRepository userInfoRepository;

    public Optional<UserInfo> findByName(String name) {
        return userInfoRepository.findByName(name);
    }
}
