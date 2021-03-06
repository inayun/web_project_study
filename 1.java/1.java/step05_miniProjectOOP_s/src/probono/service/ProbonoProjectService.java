package probono.service;

import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Activist;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ProbonoProject[] projectList = new ProbonoProject[10];
	private int index;

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//모든 Project 반환
	public ProbonoProject[] getAllProjects() {
		return projectList;
	}

	//Project 검색
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				break;
			}
		}
		return project;
	}

	//Project 추가
	public void projectInsert(ProbonoProject project) {
		projectList[index++] = project;
	}
	
	
	//??? 다형성 적용 메소드로 확장하기
	//instanceof - 객체 타입 비교 연산자 활용하여 기부자와 수혜자 정보를 구분해서 수정해보기
		
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정 
	public void projectUpdate(String projectName, People people){
		//기부자일경우
		if( people instanceof Activist){
			Activist a = ((Activist)people);
			for(int i = 0; i< index; i++){
				if(projectList[i].getProbonoProjectName().equals(projectName)){
					projectList[i].setActivist(a) ;
					break;
				}
			}
		//수혜자일경우
		}else{
			Recipient r = ((Recipient)people);
			for(int i = 0; i < index; i++){
				if(projectList[i].getProbonoProjectName().equals(projectName)){
					projectList[i].setReceive(r);
					break;
				}
			}
		}
	}
	
	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				break;
			}
		}
	}
	
	//Project 개수
	public int projectListSize(){
		return index;
	}
}
