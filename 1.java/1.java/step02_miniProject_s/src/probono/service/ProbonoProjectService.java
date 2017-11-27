/* SingleTon Pattern
 * - �ڹ� ����ȯ��� ���������� ��ü�� ���� ����
 */
package probono.service;

import probono.model.dto.Activist;
import probono.model.dto.ProbonoProject;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ProbonoProject[] projectList = new ProbonoProject[10];
	
	private int index; 

	private ProbonoProjectService(){}
	
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	public ProbonoProject[] getAllProjects() {
		return projectList;
	}

	//���� 3
	//Project �˻� - Project������ ��û�ϴ� Project ��ü �˻��ؼ� ��ȯ�ϱ�
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;  //project ���� ���� �ΰ����� �ʱ�ȭ
		for (int i = 0; i < index; i++){ 
			if(projectList[i].getProbonoProjectName().equals(projectName)){
				project = projectList[i];
			} //�����ϴ� ����Ʈ�� �ε��� ����ŭ �ݺ����� ������ �ε������� ������Ʈ�̸��� �Ķ���Ͱ����� ���� �̸��� ��ġ�Ѵٸ�
				// project ������ �ش� �ε����� �������� ���� project ��ȯ�ϱ�
		}
		return project;
	}

	//���� 4
	//Project �߰� - Project�� �迭�� �߰� �����ϱ� �޼ҵ� 
	public void projectInsert(ProbonoProject project) {
	
		for (int i = 0; i < projectList.length ; i ++){
			if(projectList[i] == null){
				projectList[i] = project;
				index ++;
				break;
			}	// projectList�� ����(10)��ŭ �ݺ����� �����鼭 ó�� �ε������� ������� ���� �ش� �ε����� ���� �������� �ʴ´ٸ�
			//���� �������� �ʴ� �ش� �ε����� �Ķ���ͷ� ���� ������Ʈ�� �߰��ϰ� �ε����� 1�� �����ϰ� �극��ũ�ɱ�
		} 
	}
	
	
	//Project ���� - ������Ʈ ������ ��� ����� ����
	public void projectUpdate(String projectName, Activist people){
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				project.setActivist(people);
				break;
			}
		}
	}
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				index--;
				break;
			}
		}
	}
	
	//Project ����
	public int projectListSize(){
		return index;
	}
}
