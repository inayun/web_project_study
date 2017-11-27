package probono.service;

import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.service.NotExistException;
import java.util.ArrayList;
import probono.model.dto.Activist;
import probono.model.dto.Recipient;

public class ProbonoProjectService {

	private static ProbonoProjectService instance = new ProbonoProjectService();

	private ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();

	private ProbonoProjectService() {
	}

	public static ProbonoProjectService getInstance() {
		return instance;
	}

	// ��� Project ��ȯ
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	// Project �˻�
	public ProbonoProject getProbonoProject(String projectName) throws NotExistException {
		ProbonoProject project = null;
		// ���� ó��!!!!!
		if (projectList.size() == 0) {
			throw new NotExistException("�����Ͱ� �������� �ʽ��ϴ�.");
		}
		for (int i = 0; i < projectList.size(); i++) {
			if ((projectList.get(i)).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				break;
			}
		}
		return project;
	}

	// Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList.add(project);
	}

	// ??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	// instanceof - ��ü Ÿ�� �� ������ Ȱ���Ͽ� ����ڿ� ������ ������ �����ؼ� �����غ���

	// Project ���� - ������Ʈ ������ ��� ����� ����
	public void projectUpdate(String projectName, People people) throws NotExistException {
		// ������ϰ��
		if (projectList.size() == 0) {
			throw new NotExistException("�����Ͱ� �������� �ʽ��ϴ�.");
		}

		if (people instanceof Activist) {
			Activist a = ((Activist) people);
			for (int i = 0; i < projectList.size(); i++) {
				if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
					projectList.get(i).setActivist(a);
					break;
				}
			}
			// �������ϰ��
		} else {
			Recipient r = ((Recipient) people);
			for (int i = 0; i < projectList.size(); i++) {
				if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
					projectList.get(i).setReceive(r);
					break;
				}
			}
		}
	}

	// Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}

	// Project ����
	public int projectListSize() {
		return projectList.size();
	}
}
