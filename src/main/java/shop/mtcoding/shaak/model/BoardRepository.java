package shop.mtcoding.shaak.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardRepository {

    public int insert(@Param("userId") int userId, @Param("title") String title, @Param("content") String content);

    public List<Board> findAll();

    public int deleteById(int id);

    public int updateById(@Param("id") int id, @Param("title") String title, @Param("content") String content);
}
