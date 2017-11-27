package probono.view;

import java.util.ArrayList;

import probono.model.dto.ProbonoProject;

public class RunningEndView {
	
	//특정 프로젝트 출력 
	public static void projectView(ProbonoProject project){
		System.out.println(project);		
	}
	
	//모든 프로젝트 출력
	public static void projectListView(ArrayList<ProbonoProject> allProbonoProject){
		for(int i= 0; i < allProbonoProject.size(); i++){			
			if(allProbonoProject.get(i) != null){
				System.out.println("[프로젝트 " + (i+1) + "]\n" + allProbonoProject.get(i));
			}
		}
	}
}
