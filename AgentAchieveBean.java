package agentpack;

public class AgentAchieveBean {

	private String AgentId;
	private String AgentName;
	private String NoOfTargets;
	private int NoOfAchievement;
	private Integer NoOfMeetingAttended;
	private Double CurrentCommission;
	private Double TotalAmount;
	private Integer Duration;
	private String complaints;
	
	public String getAgentId() {
		return AgentId;
	}

	public void setAgentId(String agentId) {
		AgentId = agentId;
	}

	public String getAgentName() {
		return AgentName;
	}

	public void setAgentName(String agentName) {
		AgentName = agentName;
	}

	public String getNoOfTargets() {
		return NoOfTargets;
	}

	public void setNoOfTargets(String noOfTargets) {
		NoOfTargets = noOfTargets;
	}

	public int getNoOfAchievement() {
		return NoOfAchievement;
	}

	public void setNoOfAchievement(int noOfAchievement) {
		NoOfAchievement = noOfAchievement;
	}

	public Integer getNoOfMeetingAttended() {
		return NoOfMeetingAttended;
	}

	public void setNoOfMeetingAttended(Integer noOfMeetingAttended) {
		NoOfMeetingAttended = noOfMeetingAttended;
	}

	public Double getCurrentCommission() {
		return CurrentCommission;
	}

	public void setCurrentCommission(Double currentCommission) {
		CurrentCommission = currentCommission;
	}

	public Double getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}

	public Integer getDuration() {
		return Duration;
	}

	public void setDuration(Integer duration) {
		Duration = duration;
	}

	public String getComplaints() {
		return complaints;
	}

	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}

	@Override
	public String toString() {
		return "AgentAchieveBean [AgentId=" + AgentId + ", AgentName="
				+ AgentName + ", NoOfTargets=" + NoOfTargets
				+ ", NoOfAchievement=" + NoOfAchievement
				+ ", NoOfMeetingAttended=" + NoOfMeetingAttended
				+ ", CurrentCommission=" + CurrentCommission + ", TotalAmount="
				+ TotalAmount + ", Duration=" + Duration + ", complaints="
				+ complaints + "]";
	}

	

}
