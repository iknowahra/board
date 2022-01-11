package ultra.board.mapper;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import ultra.board.dto.UserDto;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserDto> getUserOne(UserDto userDto);
    
    public List<UserDto> postUserOne(UserDto userDto);
}
