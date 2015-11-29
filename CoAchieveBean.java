package copack;

public class CoAchieveBean {

	private Integer coId;
	private String name;
	private Integer exp;
	private Integer noOfAgentAppr;
	private Double agentAmt;
	private Double agentComm;
	private Integer agentDo;
	private Double agentDoAmt;
	private Double agentDoComm;
	private Double agentCommDo;
	
	public Integer getCoId() {
		return coId;
	}
	public void setCoId(Integer coId) {
		this.coId = coId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	public Integer getNoOfAgentAppr() {
		return noOfAgentAppr;
	}
	public void setNoOfAgentAppr(Integer noOfAgentAppr) {
		this.noOfAgentAppr = noOfAgentAppr;
	}
	public Double getAgentAmt() {
		return agentAmt;
	}
	public void setAgentAmt(Double agentAmt) {
		this.agentAmt = agentAmt;
	}
	public Double getAgentComm() {
		return agentComm;
	}
	public void setAgentComm(Double agentComm) {
		this.agentComm = agentComm;
	}
	public Integer getAgentDo() {
		return agentDo;
	}
	public void setAgentDo(Integer agentDo) {
		this.agentDo = agentDo;
	}
	public Double getAgentDoAmt() {
		return agentDoAmt;
	}
	public void setAgentDoAmt(Double agentDoAmt) {
		this.agentDoAmt = agentDoAmt;
	}
	public Double getAgentDoComm() {
		return agentDoComm;
	}
	public void setAgentDoComm(Double agentDoComm) {
		this.agentDoComm = agentDoComm;
	}
	public Double getAgentCommDo() {
		return agentCommDo;
	}
	public void setAgentCommDo(Double agentCommDo) {
		this.agentCommDo = agentCommDo;
	}
	
	@Override
	public String toString() {
		return "CoAchieveBean [coId=" + coId + ", name=" + name + ", exp="
				+ exp + ", noOfAgentAppr=" + noOfAgentAppr + ", agentAmt="
				+ agentAmt + ", agentComm=" + agentComm + ", agentDo="
				+ agentDo + ", agentDoAmt=" + agentDoAmt + ", agentDoComm="
				+ agentDoComm + ", agentCommDo=" + agentCommDo + "]";
	}
	
	
	
}
