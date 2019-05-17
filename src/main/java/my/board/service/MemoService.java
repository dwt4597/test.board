package my.board.service;

import java.util.List;
import java.util.Random;

import my.board.mapper.MemoDao;
import my.board.model.MemoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoService {
	@Autowired
	private MemoDao mDao;
	
	public int insert(MemoVO memoVO) {
		
		//서비스에서 PK (id number)값을 생성한 후
		//db에 추가하기
		Random r = new Random();
		long id = r.nextLong() +1; // Long형으로 임의의 숫자 생성
		memoVO.setId(id); // 메모의 키값 셋팅
		
		//textBox에 입력할 때, Enter를 포함해서
		//줄바꿈을 처리했을 때
		// br tag로 변환해서 저장
		String m_memo = memoVO.getM_memo();
		m_memo = m_memo.replaceAll("\r|\n", "<br/>");
		
		memoVO.setM_memo(m_memo);
		int ret =	mDao.insert(memoVO);
		return ret;
		
	}

	public List<MemoVO> selectAll() {
		// TODO Auto-generated method stub
		return mDao.selectAll();
	}

	public int delete(long id) {
		// TODO Auto-generated method stub
		return mDao.delete(id);
	}
	
}
