package probono.view;

import java.util.ArrayList;

import probono.model.dto.ProbonoProject;

public class RunningEndView {
	
	//Ư�� ������Ʈ ��� 
	public static void projectView(ProbonoProject project){
		System.out.println(project);		
	}
	
	//��� ������Ʈ ���
	public static void projectListView(ArrayList<ProbonoProject> allProbonoProject){
		for(int i= 0; i < allProbonoProject.size(); i++){			
			if(allProbonoProject.get(i) != null){
				System.out.println("[������Ʈ " + (i+1) + "]\n" + allProbonoProject.get(i));
			}
		}
	}
}
