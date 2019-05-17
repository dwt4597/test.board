package my.board.mapper;

import java.util.List;

import my.board.model.MemoVO;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

public interface MemoDao {

	@Select("select * from tbl_memo")
	public List<MemoVO> selectAll();
	
	@Select("select * from tbl_memo WHERE id=#{id}")
	public MemoVO findById(long id);
	
	@InsertProvider(type=MemoSQL.class, method="memo_insert_sql")
	public int insert(MemoVO memoVO);
	
	@UpdateProvider(type=MemoSQL.class, method="memo_update_sql")
	public int update(MemoVO memoVO);
	
	@Delete("delete from tbl_memo WHERE id=#{id}")
	public int delete(long id);
	
}
