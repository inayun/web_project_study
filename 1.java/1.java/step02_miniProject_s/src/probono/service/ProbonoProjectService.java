/* SingleTon Pattern
 * - 자바 실행환경상에 강제적으로 객체의 수를 제한
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

	//문제 3
	//Project 검색 - Project명으로 요청하는 Project 객체 검색해서 반환하기
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;  //project 로컬 변수 널값으로 초기화
		for (int i = 0; i < index; i++){ 
			if(projectList[i].getProbonoProjectName().equals(projectName)){
				project = projectList[i];
			} //존재하는 리스트의 인덱스 수만큼 반복문을 돌려서 인덱스마다 프로젝트이름과 파라미터값으로 받은 이름이 일치한다면
				// project 변수에 해당 인덱스의 정보들을 놓고 project 반환하기
		}
		return project;
	}

	//문제 4
	//Project 추가 - Project를 배열에 추가 저장하기 메소드 
	public void projectInsert(ProbonoProject project) {
	
		for (int i = 0; i < projectList.length ; i ++){
			if(projectList[i] == null){
				projectList[i] = project;
				index ++;
				break;
			}	// projectList의 길이(10)만큼 반복문을 돌리면서 처음 인덱스부터 순서대로 만약 해당 인덱스에 값이 존재하지 않는다면
			//값이 존재하지 않는 해당 인덱스에 파라미터로 받은 프로젝트를 추가하고 인덱스값 1씩 증가하고 브레이크걸기
		} 
	}
	
	
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정
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
	
	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				index--;
				break;
			}
		}
	}
	
	//Project 개수
	public int projectListSize(){
		return index;
	}
}
