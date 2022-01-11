package ultra.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    private long id;
    private long userId;
    private String kind;
    private String title;
    private String content;
    private String regDt;
    private String upDt;
}
