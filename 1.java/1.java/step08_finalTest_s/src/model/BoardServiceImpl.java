package model;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import exception.DuplicateException;
import exception.InexistentException;
import model.dto.ArchiveBoard;
import model.dto.Board;
import model.dto.PhotoBoard;

public class BoardServiceImpl implements BoardServiceIF {

	HashMap<String, HashMap<String, Board>> allBoardList = new HashMap<String, HashMap<String, Board>>();

	HashMap<String, Board> archiveList = new HashMap<String, Board>();
	HashMap<String, Board> photoList = new HashMap<String, Board>();

	private static BoardServiceImpl instance = new BoardServiceImpl();

	/**
	 * 파일로 부터 데이터를 로딩해서 Map에 저장하는 생성자
	 */
	private BoardServiceImpl() {

		String[] boardValue = null;
		String key = null;
		Iterator<String> allKey = null;

		// 자료실 정보
		try {
			Properties info1 = new Properties();
			info1.load(new FileReader("archiveInfo.properties"));
			allKey = info1.stringPropertyNames().iterator();
			while (allKey.hasNext()) {
				key = allKey.next();
				boardValue = info1.getProperty(key).split(",");
				archiveList.put(key, new ArchiveBoard(Integer.parseInt(boardValue[0]), boardValue[1], boardValue[2],
						boardValue[3], boardValue[4], boardValue[5], Integer.parseInt(boardValue[6])));
				allBoardList.put("archive", archiveList);
			}
		// 사진 정보
			Properties info2 = new Properties();
			info2.load(new FileReader("photoInfo.properties"));
			allKey = info2.stringPropertyNames().iterator();
			while (allKey.hasNext()) {
				key = allKey.next();
				boardValue = info2.getProperty(key).split(",");
				photoList.put(key, new PhotoBoard(Integer.parseInt(boardValue[0]), boardValue[1], boardValue[2],
						boardValue[3], boardValue[4], boardValue[5]));
				allBoardList.put("photo", photoList);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * BoardServiceImpl 객체 생성
	 */
	public static BoardServiceImpl getInstance() {
		return instance;
	}

	/**
	 * 모든 게시물 검색(자료실, 사진)
	 * 
	 * @return
	 */
	@Override
	public HashMap<String, HashMap<String, Board>> getBoardList() {
		return allBoardList;
	}

	/**
	 * 게시판 유형에 따른 검색 모든 자료실 or 모든 사진자료실 검색
	 * 
	 * @return
	 */
	@Override
	public HashMap<String, Board> getBoardByKind(String kind) {
		return allBoardList.get(kind);
	}

	/**
	 * 글번호에 해당하는 게시물 검색
	 */
	@Override
	public Board getBoardByno(String kind, int no) throws InexistentException {
		Board board = allBoardList.get(kind).get(Integer.toString(no));
		// 해당번호의 게시물이 존재하지 않는 경우
		if (board == null) {
			throw new InexistentException(no);
		} else {
			return board;
		}
	}

	/**
	 * 글번호에 해당하는 게시물 저장
	 */
	@Override
	public void insertBoard(String kind, Board board) throws DuplicateException {
		if (existBoardBykind(kind, board.getNo())) {
			throw new DuplicateException(kind + "의 글번호 " + board.getNo());
		} else {
			allBoardList.get(kind).put(Integer.toString(board.getNo()), board);
		}
	}

	/**
	 * 글번호에 해당하는 게시물 수정 (제목과 내용 만 수정가능함.)
	 */
	@Override
	public void updateBoard(String kind, String subject, String content, int no) throws InexistentException {
		if (existBoardBykind(kind, no)) {
			Board board = allBoardList.get(kind).get(Integer.toString(no));
			board.setContent(content);
			board.setSubject(subject);
		} else {
			throw new InexistentException(no);
		}
	}

	/**
	 * 글번호에 해당하는 게시물 삭제
	 */
	@Override
	public void deleteBoard(String kind, int no) throws InexistentException {
		Board board = allBoardList.get(kind).get(Integer.toString(no));
		if (board == null) {
			throw new InexistentException(no);
		} else {
			allBoardList.get(kind).remove(Integer.toString(no));
		}
	}

	/**
	 * 게시물 종류 존재여부 체크 return => true : 게시물 존재 , false : 게시물 없음
	 */
	@Override
	public boolean existBoardBykind(String kind, int no) {
		HashMap<String, Board> boardList = allBoardList.get(kind);
		return boardList.containsKey(Integer.toString(no));
	}

}
