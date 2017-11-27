package view;

import java.util.HashMap;
import java.util.Iterator;

import model.dto.Board;

public class SuccessView {
	/**
	 * ��� �Խù� ���
	 * */
  public static void printBoard(HashMap<String, HashMap<String, Board>> board){
	  Iterator<String> allKind= board.keySet().iterator();
	  while(allKind.hasNext()){
		 String key = allKind.next();
		 System.out.println("----- "+ key +" Board�� ��� �Խù�  List ----- ");
		 System.out.println(board.get(key)+"\n");
	  }
  }
  
  /**
   *  �Խ��� ������ ���� ���
   * */
   public static void printBoardBykind(String kind, HashMap<String, Board> board){
	   System.out.println("------"+kind+" ���� �Խù� List -------");
	   Iterator<String> keys = board.keySet().iterator();
	   while(keys.hasNext()){
		   System.out.println(board.get(keys.next()));
	   }
   }
  
    /**
     * �Խù� ���/����/���� ���� �� �޽��� ���
     * */ 
    public static void successMessage(String message) {
		System.out.println(message);
	}
    

    public static void printBoardByno(Board board){
 		System.out.println(" �Խù� ���� - " + board);
 	}
  
  
}
