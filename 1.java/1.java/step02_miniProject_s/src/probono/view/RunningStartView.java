package probono.view;

import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;
import probono.service.ProbonoProjectService;

public class RunningStartView {
	
	public static void main(String[] args) {
		
		//기부자
		Activist doctor = new Activist("giver1", "나기부", "gp1", "dermatology");
		Activist audrey = new Activist("giver2", "오드리", "gp2", "culture");
		Activist daddy = new Activist("giver3", "키다리", "gp3", "mentor");
				
		//대상자
		Recipient receive1 = new Recipient("receivePeople1", "나아토피", "rp1", "아토피 치료");
		Recipient receive2 = new Recipient("receivePeople2", "나문화", "rp2", "감성 치료");
		Recipient receive3 = new Recipient("receivePeople3", "나멘토", "rp3", "심리 상담");
		
		//재능 기부 내용
		Probono schweitzer 
			= new Probono("schweitzer", "슈바이처 프로젝트", "의사, 한의사, 수의사등의 의료 활동 및 후원 등 의료, 보건, 건강과 관련된 분야");
		Probono audreyHepbun 
			= new Probono("audreyHepbun", "오드레햅번 프로젝트", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 미용,환경 캠페인 등 문화ㆍ예술관련 분야");
		Probono daddyLongLegs 
		= new Probono("daddyLongLegs", "키다리아저씨 프로젝트", "결연, 상담, 멘토, 독서ㆍ학습지도 및 교육기회 제공, 장학지원, 심리상담 등 멘토링, 상담, 교육, 결연분야");
	
		
		//재능 기부 프로젝트
		ProbonoProject schweitzerProject 
		= new ProbonoProject("슈바이처 프로젝트", schweitzer, doctor, receive1, "아토피 무상 치료");		
		
		ProbonoProject audreyHepbunPorject = new ProbonoProject("오드리햅버 프로젝트", audreyHepbun, audrey, receive2, "무료 컷팅");
		ProbonoProject daddyLongLegsProject = new ProbonoProject("키다리아저씨 프로젝트", daddyLongLegs, daddy, receive3, "장학금 지원");
				
			
		ProbonoProjectService service = ProbonoProjectService.getInstance();
		
		System.out.println("***** Project 생성 후 모든 Project 검색 *****");
		service.projectInsert(schweitzerProject);
		service.projectInsert(audreyHepbunPorject);
		service.projectInsert(daddyLongLegsProject);
		
		ProbonoProject [] allProbonoProject = service.getAllProjects();		
		RunningEndView.projectListView(allProbonoProject);	
	
		//재능 기부자 변경하기 
		System.out.println("\n***** 슈바이처 Project 재능 기부자 수정 후 해당 Project 검색 *****");
		Activist doctor2 = new Activist("giver4", "나한의", "gp4", "orientalDoctor");
		service.projectUpdate("슈바이처 프로젝트", doctor2);
		
		ProbonoProject project = service.getProbonoProject("슈바이처 프로젝트");
		RunningEndView.projectView(project);
		
		//재능 기부자 삭제하기 
		System.out.println("\n***** 키다리아저씨 Project 삭제 후 모든 Project 검색 *****");
		service.projectDelete("키다리아저씨 프로젝트");
		allProbonoProject = service.getAllProjects();
		RunningEndView.projectListView(allProbonoProject);
	}
}
