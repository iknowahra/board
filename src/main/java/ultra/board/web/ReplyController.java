package ultra.board.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ultra.board.dto.ReplyDto;
import ultra.board.service.ReplyService;

import java.util.List;

@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/reply")
@Controller
public class ReplyController {
    private final ReplyService service;

    @GetMapping("/{boardId}")
    public List<ReplyDto> getList(@ModelAttribute ReplyDto replyDto) {
        return service.getReplyList(replyDto);
    }

    @PostMapping("/{boardId}/new/{parentId}")
    public int postOne(@ModelAttribute ReplyDto replyDto) {
        return service.postReplyOne(replyDto);
    }
}
