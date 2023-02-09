package shop.mtcoding.shaak.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.shaak.dto.board.BoardReq.BoardMainRespDto;

@Mapper
public interface BoardRepository {

    public int insert( @Param("title") String title, @Param("content") String content, @Param("userId") int userId);

    public List<Board> findAll();

    public int deleteById(int id);

    public int updateById(@Param("id") int id, @Param("title") String title, @Param("content") String content);

    public List<BoardMainRespDto> findAllWithUser();
}
