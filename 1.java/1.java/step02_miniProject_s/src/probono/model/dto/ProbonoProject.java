/*
 * 재능 나눔 프로젝트
 */
package probono.model.dto;

public class ProbonoProject {

	private String probonoProjectName;//해당 프로젝트 구분 
	private Probono probono;//재능 기부 정보 
	private Activist activist;//재능 기부자 정보 
	private Recipient receive;//재능 수혜자 정보 
	private String projectContent;//프로젝트 실제 내용

	public ProbonoProject() {}
	
	public ProbonoProject(String probonoProjectName, Probono probono,
			Activist activist, Recipient receive, String projectContent) {
		super();
		this.probonoProjectName = probonoProjectName;
		this.probono = probono;
		this.activist = activist;
		this.receive = receive;
		this.projectContent = projectContent;
	}

	public String getProbonoProjectName() {
		return probonoProjectName;
	}

	public void setProbonoProjectName(String probonoProjectName) {
		this.probonoProjectName = probonoProjectName;
	}

	public Probono getProbono() {
		return probono;
	}

	public void setProbono(Probono probono) {
		this.probono = probono;
	}

	public Activist getActivist() {
		return activist;
	}

	public void setActivist(Activist activist) {
		this.activist = activist;
	}

	public Recipient getReceive() {
		return receive;
	}

	public void setReceive(Recipient receive) {
		this.receive = receive;
	}

	public String getProjectContent() {
		return projectContent;
	}

	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 프로젝트명 : ");
		builder.append(probonoProjectName);
		builder.append("\n2. 재능 기부 내용 : ");
		builder.append(probono);
		builder.append("\n3. 재능 기부자 정보: ");
		builder.append(activist);
		builder.append("\n4. 수혜자 정보: ");
		builder.append(receive);
		builder.append("\n5. 프로젝트 내용 : ");
		builder.append(projectContent);
		return builder.toString(); 
	}
}
