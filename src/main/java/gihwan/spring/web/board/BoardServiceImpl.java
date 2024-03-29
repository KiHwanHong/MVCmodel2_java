//package gihwan.spring.web.board;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import gihwan.spring.web.board.impl.BoardDAOSpring;
//import gihwan.spring.web.board.impl.BoardService;
//import lombok.extern.slf4j.Slf4j;
//
////@Service("boardService")
//public class BoardServiceImpl implements BoardService {
//
//	@Autowired
//	private BoardDAOSpring boardDAO;
//
//	@Override
//	public void insertBoard(BoardVO vo) {
//		boardDAO.insertBoard(vo);
//	}
//
//	@Override
//	public void updateBoard(BoardVO vo) {
//		boardDAO.updateBoard(vo);
//	}
//
//	@Override
//	public void deleteBoard(BoardVO vo) {
//		boardDAO.deleteBoard(vo);
//	}
//
//	@Override
//	public BoardVO getBoard(BoardVO vo) {
//		return boardDAO.getBoard(vo);
//	}
//
//	@Override
//	public List<BoardVO> getBoardList(BoardVO vo) {
//		
//		return boardDAO.getBoardList(vo);
//	}
//}
