package ultra.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ultra.board.dto.BoardDto;
import ultra.board.mapper.BoardMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public List<BoardDto> getBoardList(BoardDto boardDto) {
        return mapper.getBoardList(boardDto);
    }

    public List<BoardDto> getBoardOne(BoardDto boardDto) {
        return mapper.getBoardOne(boardDto);
    }

    public List<BoardDto> postBoardOne(BoardDto boardDto) {
        return mapper.postBoardOne(boardDto);
    }
}
