package ultra.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ultra.board.dto.UserDto;
import ultra.board.mapper.UserMapper;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper mapper;

    public List<UserDto> getUserOne(UserDto userDto) {
        return mapper.getUserOne(userDto);
    }

    public List<UserDto> postUserOne(UserDto userDto) {
        return mapper.postUserOne(userDto);
    }
}
