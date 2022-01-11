package ultra.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import ultra.board.dto.ReplyDto;

import java.util.List;

@Mapper
public interface ReplyMapper {
    public List<ReplyDto> getReplyList(ReplyDto replyDto);

    public int postReplyOne(ReplyDto replyDto);
}
