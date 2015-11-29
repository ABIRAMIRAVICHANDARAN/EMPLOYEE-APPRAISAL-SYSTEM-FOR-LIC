package dopack;

public class DOAchieveBean {
	
	private String DOId;
	private String DOName;
	private String Experience;
	private int NoOfTargets;
	private String NoOfAchievement;
	private String NoOfMeetingAttended;
	private String Percentagecommission;
	private String NoOfCanvas;
	private String NoOfAchievementamt;
	
	public String getNoOfAchievementamt() {
		return NoOfAchievementamt;
	}
	public void setNoOfAchievementamt(String noOfAchievementamt) {
		NoOfAchievementamt = noOfAchievementamt;
	}
	public String getDOId() {
		return DOId;
	}
	public void setDOId(String dOId) {
		DOId = dOId;
	}
	public String getDOName() {
		return DOName;
	}
	public void setDOName(String dOName) {
		DOName = dOName;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public int getNoOfTargets() {
		return NoOfTargets;
	}
	public void setNoOfTargets(int noOfTargets) {
		NoOfTargets = noOfTargets;
	}
	public String getNoOfAchievement() {
		return NoOfAchievement;
	}
	public void setNoOfAchievement(String noOfAchievement) {
		NoOfAchievement = noOfAchievement;
	}
	public String getNoOfMeetingAttended() {
		return NoOfMeetingAttended;
	}
	public void setNoOfMeetingAttended(String noOfMeetingAttended) {
		NoOfMeetingAttended = noOfMeetingAttended;
	}
	public String getPercentagecommission() {
		return Percentagecommission;
	}
	public void setPercentagecommission(String percentagecommission) {
		Percentagecommission = percentagecommission;
	}
	public String getNoOfCanvas() {
		return NoOfCanvas;
	}
	public void setNoOfCanvas(String noOfCanvas) {
		NoOfCanvas = noOfCanvas;
	}
	@Override
	public String toString() {
		return "DOAchieveBean [DOId=" + DOId + ", DOName=" + DOName
				+ ", Experience=" + Experience + ", NoOfTargets=" + NoOfTargets
				+ ", NoOfAchievement=" + NoOfAchievement
				+ ", NoOfMeetingAttended=" + NoOfMeetingAttended
				+ ", Percentagecommission=" + Percentagecommission
				+ ", NoOfCanvas=" + NoOfCanvas + ", NoOfAchievementamt="
				+ NoOfAchievementamt + "]";
	}
	
	
	
	
}
