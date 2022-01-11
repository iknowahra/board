package ultra.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyDto {
    private long id;
    private long boardId;
    private long parentId;
    private int depth;
    private long userId;
    private String userNm;
    private String guestNm;
    private String guestPw;
    private String content;
    private String regDt;
    private String upDt;
    private String useYn;
}
