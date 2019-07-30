package pojo;

/*
 * 用于存放查询公司的风险信息
 */

public class CompanyRisk {
	private int riskID;
	private String companyName;
	private String riskName;
	private String riskSummary;
	
	//一些get和set方法
	public int getRiskID() {
		return riskID;
	}
	public void setRiskID(int riskID) {
		this.riskID = riskID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getRiskSummary() {
		return riskSummary;
	}
	public void setRiskSummary(String riskSummary) {
		this.riskSummary = riskSummary;
	}
}
