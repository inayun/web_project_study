package probono.view;

import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;
import probono.service.ProbonoProjectService;

public class RunningStartView {
	
	public static void main(String[] args) {
		
		//�����
		Activist doctor = new Activist("giver1", "�����", "gp1", "dermatology");
		Activist audrey = new Activist("giver2", "���帮", "gp2", "culture");
		Activist daddy = new Activist("giver3", "Ű�ٸ�", "gp3", "mentor");
				
		//�����
		Recipient receive1 = new Recipient("receivePeople1", "��������", "rp1", "������ ġ��");
		Recipient receive2 = new Recipient("receivePeople2", "����ȭ", "rp2", "���� ġ��");
		Recipient receive3 = new Recipient("receivePeople3", "������", "rp3", "�ɸ� ���");
		
		//��� ��� ����
		Probono schweitzer 
			= new Probono("schweitzer", "������ó ������Ʈ", "�ǻ�, ���ǻ�, ���ǻ���� �Ƿ� Ȱ�� �� �Ŀ� �� �Ƿ�, ����, �ǰ��� ���õ� �о�");
		Probono audreyHepbun 
			= new Probono("audreyHepbun", "���巹�ݹ� ������Ʈ", "������, ��ȭ���� ���α׷� ����, ���ä����� �� ��ȸ����, �̿�,ȯ�� ķ���� �� ��ȭ���������� �о�");
		Probono daddyLongLegs 
		= new Probono("daddyLongLegs", "Ű�ٸ������� ������Ʈ", "�Ῥ, ���, ����, �������н����� �� ������ȸ ����, ��������, �ɸ���� �� ���丵, ���, ����, �Ῥ�о�");
	
		
		//��� ��� ������Ʈ
		ProbonoProject schweitzerProject 
		= new ProbonoProject("������ó ������Ʈ", schweitzer, doctor, receive1, "������ ���� ġ��");		
		
		ProbonoProject audreyHepbunPorject = new ProbonoProject("���帮�ݹ� ������Ʈ", audreyHepbun, audrey, receive2, "���� ����");
		ProbonoProject daddyLongLegsProject = new ProbonoProject("Ű�ٸ������� ������Ʈ", daddyLongLegs, daddy, receive3, "���б� ����");
				
			
		ProbonoProjectService service = ProbonoProjectService.getInstance();
		
		System.out.println("***** Project ���� �� ��� Project �˻� *****");
		service.projectInsert(schweitzerProject);
		service.projectInsert(audreyHepbunPorject);
		service.projectInsert(daddyLongLegsProject);
		
		ProbonoProject [] allProbonoProject = service.getAllProjects();		
		RunningEndView.projectListView(allProbonoProject);	
	
		//��� ����� �����ϱ� 
		System.out.println("\n***** ������ó Project ��� ����� ���� �� �ش� Project �˻� *****");
		Activist doctor2 = new Activist("giver4", "������", "gp4", "orientalDoctor");
		service.projectUpdate("������ó ������Ʈ", doctor2);
		
		ProbonoProject project = service.getProbonoProject("������ó ������Ʈ");
		RunningEndView.projectView(project);
		
		//��� ����� �����ϱ� 
		System.out.println("\n***** Ű�ٸ������� Project ���� �� ��� Project �˻� *****");
		service.projectDelete("Ű�ٸ������� ������Ʈ");
		allProbonoProject = service.getAllProjects();
		RunningEndView.projectListView(allProbonoProject);
	}
}
