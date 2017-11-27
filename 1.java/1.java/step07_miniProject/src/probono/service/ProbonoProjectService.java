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

	// 모든 Project 반환
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	// Project 검색
	public ProbonoProject getProbonoProject(String projectName) throws NotExistException {
		ProbonoProject project = null;
		// 예외 처리!!!!!
		if (projectList.size() == 0) {
			throw new NotExistException("데이터가 존재하지 않습니다.");
		}
		for (int i = 0; i < projectList.size(); i++) {
			if ((projectList.get(i)).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				break;
			}
		}
		return project;
	}

	// Project 추가
	public void projectInsert(ProbonoProject project) {
		projectList.add(project);
	}

	// ??? 다형성 적용 메소드로 확장하기
	// instanceof - 객체 타입 비교 연산자 활용하여 기부자와 수혜자 정보를 구분해서 수정해보기

	// Project 수정 - 프로젝트 명으로 재능 기부자 수정
	public void projectUpdate(String projectName, People people) throws NotExistException {
		// 기부자일경우
		if (projectList.size() == 0) {
			throw new NotExistException("데이터가 존재하지 않습니다.");
		}

		if (people instanceof Activist) {
			Activist a = ((Activist) people);
			for (int i = 0; i < projectList.size(); i++) {
				if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
					projectList.get(i).setActivist(a);
					break;
				}
			}
			// 수혜자일경우
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

	// Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}

	// Project 개수
	public int projectListSize() {
		return projectList.size();
	}
}
