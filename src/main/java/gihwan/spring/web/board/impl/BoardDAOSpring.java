//package gihwan.spring.web.board.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import gihwan.spring.web.board.BoardVO;
//
////@Repository
//public class BoardDAOSpring {
//
//	private final String BOARD_INSERT = "insert into myboard(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from myboard), ?, ?, ?)";
//	private final String BOARD_UPDATE = "update myboard set title=?, " + "content=? where seq=?";
//	private final String BOARD_DELETE = "delete myboard where seq=?";
//	private final String BOARD_GET = "select * from myboard where seq=?";
//	private final String BOARD_LIST = "select * from myboard order by seq desc";
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	public void insertBoard(BoardVO vo) {
//		System.out.println("Spring JDBC로  insertBoard() 기능처리");
//		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
//	}
//
//	public void updateBoard(BoardVO vo) {
//		System.out.println("Spring JDBC로  updateBoard() 기능처리");
//		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
//	}
//
//	public void deleteBoard(BoardVO vo) {
//		System.out.println("Spring JDBC로  deleteBoard() 기능처리");
//		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
//	}
//
//	public BoardVO getBoard(BoardVO vo) {
//		System.out.println("Spring JDBC로  getBoard() 기능처리");
//		Object[] args = { vo.getSeq() };
//		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
//
//	}
//
//	public List<BoardVO> getBoardList(BoardVO vo) {
//		System.out.println("Spring JDBC로  getBoardList() 기능처리");
//		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
//	}
//}
