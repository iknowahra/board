package ultra.board.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ultra.board.dto.UserDto;
import ultra.board.service.UserService;

import java.util.List;

@ResponseBody
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService service;

    @RequestMapping("/login")
    public List<UserDto> login(@ModelAttribute UserDto userDto) {
        return service.getUserOne(userDto);
    }

    @RequestMapping("/signup")
    public List<UserDto> signup(@ModelAttribute UserDto userDto) {
        return service.postUserOne(userDto);
    }
}
