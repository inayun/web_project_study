package probono.service;

import java.sql.SQLException;
import java.util.ArrayList;

import probono.model.ActivistDAO;
import probono.model.ProbonoDAO;
import probono.model.ProbonoProjectDAO;
import probono.model.dto.ActivistDTO;
import probono.model.dto.ProbonoDTO;
import probono.model.dto.ProbonoProjectDTO;
import probono.view.RunningEndView;

//�� ���� : view.RunningStrartView���� ȣ�� 
public class ProbonoProjectController {
	
	
	//��� ������Ʈ �˻� ����
	/* ��û�� �߻� ������ ����� ��
	 * 1. �����Ͱ� �ִ�
	 * 2. ���� ������Ʈ�� ����, �����Ͱ� ����
	 * 3. ���� ���� �߻�(db���� ���� �Ǵ� �������� �Ǽ��� sql���� ����...) */
	public static void getAllProbonoProjects(){
		ArrayList<ProbonoProjectDTO> allProject = null;
		try{			
			allProject = ProbonoProjectDAO.getAllProbonoProjects();	
			RunningEndView.projectListView(allProject);
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("��� ������Ʈ �˻��� ���� �߻�");
		}
	}
	
	//���ο� ������Ʈ ���� ����
	public static void addProbonoProject(ProbonoProjectDTO probonoProject) {
	
		try{
			ProbonoProjectDAO.addProbonoProject(probonoProject);
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("��� ������Ʈ ����� ���� �߻�");
		}
	}
	
	//��� ������Ʈ �˻� ����
	public static void getAllActivists(){
		ArrayList<ActivistDTO> allProject = null;
		try{
			allProject = ActivistDAO.getAllActivists();	
			RunningEndView.projectListView(allProject);
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("��� ��� ����� �˻��� ���� �߻�");
		}
	}
	
	//���κ��� ���̵�� ���κ��� ���� ����
	public static void updateProbono(String probonoId, String probonoPurpose){
		try{
			RunningEndView.allView(ProbonoDAO.updateProbono(probonoId, probonoPurpose));
		}catch(SQLException s){
			s.printStackTrace();
			RunningEndView.showError("���κ��� id�� ���κ��� ���� ���� ����");
		}
	}
	
	//���κ��� ���� �˻�
	public static void getProbono(String probonoId) {
		try {
			RunningEndView.allView(ProbonoDAO.getProbono(probonoId));
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("���κ��� id�� �ش� ���κ��� �˻� ���� ");
		}
	}
}
