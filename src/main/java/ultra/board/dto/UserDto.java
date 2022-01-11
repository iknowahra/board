package ultra.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private long id;
    private String email;
    private String userNm;
    private String userPw;
    private String regDt;
    private String upDt;
    private String useYn;
}
