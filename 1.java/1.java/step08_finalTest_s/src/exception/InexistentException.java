package exception;
/**
 * �Խù� 
 * */
public class InexistentException extends Exception {
   public InexistentException(){
	   super("�������� �ʴ� �Խù� �Դϴ�.");
   }
   public InexistentException(String message){
	   super("�۹�ȣ " + message+"�� �������� �ʴ� �Խù� �Դϴ�.");
   }
   public InexistentException(int message){
	   super("�۹�ȣ " + message+"�� �������� �ʴ� �Խù� �Դϴ�.");
   }
}