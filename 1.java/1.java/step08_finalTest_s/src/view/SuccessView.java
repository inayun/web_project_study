package view;

import java.util.HashMap;
import java.util.Iterator;

import model.dto.Board;

public class SuccessView {
	/**
	 * 모든 게시물 출력
	 * */
  public static void printBoard(HashMap<String, HashMap<String, Board>> board){
	  Iterator<String> allKind= board.keySet().iterator();
	  while(allKind.hasNext()){
		 String key = allKind.next();
		 System.out.println("----- "+ key +" Board의 모든 게시물  List ----- ");
		 System.out.println(board.get(key)+"\n");
	  }
  }
  
  /**
   *  게시판 유형에 따른 출력
   * */
   public static void printBoardBykind(String kind, HashMap<String, Board> board){
	   System.out.println("------"+kind+" 유형 게시물 List -------");
	   Iterator<String> keys = board.keySet().iterator();
	   while(keys.hasNext()){
		   System.out.println(board.get(keys.next()));
	   }
   }
  
    /**
     * 게시물 등록/수정/삭제 성공 시 메시지 출력
     * */ 
    public static void successMessage(String message) {
		System.out.println(message);
	}
    

    public static void printBoardByno(Board board){
 		System.out.println(" 게시물 정보 - " + board);
 	}
  
  
}
