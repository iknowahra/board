package ultra.board.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ultra.board.dto.BoardDto;
import ultra.board.service.BoardService;

import java.util.List;

@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/board")
@Controller
public class BoardController {
    private final BoardService service;

    @GetMapping("/{kind}")
    public List<BoardDto> getList(@ModelAttribute BoardDto boardDto) {
        return service.getBoardList(boardDto);
    }

    @GetMapping("/{kind}/{id}")
    public List<BoardDto> getOne(@ModelAttribute BoardDto boardDto) {
        return service.getBoardOne(boardDto);
    }

    @PostMapping("/new")
    public List<BoardDto> postOne(@ModelAttribute BoardDto boardDto) {
        return service.postBoardOne(boardDto);
    }
}
