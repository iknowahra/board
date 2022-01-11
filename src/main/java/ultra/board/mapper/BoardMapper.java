package ultra.board.mapper;

import org.apache.ibatis.annotations.Mapper;
import ultra.board.dto.BoardDto;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardDto> getBoardList(BoardDto boardDto);

    public List<BoardDto> getBoardOne(BoardDto boardDto);

    public List<BoardDto> postBoardOne(BoardDto boardDto);
}
