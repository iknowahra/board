package ultra.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ultra.board.dto.ReplyDto;
import ultra.board.mapper.ReplyMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
    private final ReplyMapper mapper;

    public List<ReplyDto> getReplyList(ReplyDto replyDto) {
        return mapper.getReplyList(replyDto);
    }

    public int postReplyOne(ReplyDto replyDto) {
        return mapper.postReplyOne(replyDto);
    }
}
