package com.hsh.board;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String nameSpace = "BoardMapper"; // boardMapper.xml 의 <mapper namespace="boardMapper"> 와 맞춤
	
	@Override
	public List<BoardDTO> list(int startNum, int lastNum) throws SQLException {
		/*sqlSession.selectl*/
		return null;
	}

	@Override
	public BoardDTO view(int num) throws Exception {
		BoardDTO bdDto = sqlSession.selectOne(nameSpace+".view", num);
		return bdDto;
	}

	@Override
	public int update(BoardDTO bdDto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(BoardDTO bdDto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
