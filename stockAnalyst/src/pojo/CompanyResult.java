package pojo;

/*
 * 用于存放查询公司的成果信息
 */

public class CompanyResult {
	private String companyCode;
	private String companyName;
	private String companyYield;
	private String yieldBackground;
	private int inventorNum;
	private int developNum;
	private int priceNum;
	private String technology;
	private String techSource;
	private String techLevel;
	private String matureLevel;
	private String applicationProduct;
	private String mainCustom;
	
	//一些get和set方法
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyYield() {
		return companyYield;
	}
	public void setCompanyYield(String companyYield) {
		this.companyYield = companyYield;
	}
	public String getYieldBackground() {
		return yieldBackground;
	}
	public void setYieldBackground(String yieldBackground) {
		this.yieldBackground = yieldBackground;
	}
	public int getInventorNum() {
		return inventorNum;
	}
	public void setInventorNum(int inventorNum) {
		this.inventorNum = inventorNum;
	}
	public int getDevelopNum() {
		return developNum;
	}
	public void setDevelopNum(int developNum) {
		this.developNum = developNum;
	}
	public int getPriceNum() {
		return priceNum;
	}
	public void setPriceNum(int priceNum) {
		this.priceNum = priceNum;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getTechSource() {
		return techSource;
	}
	public void setTechSource(String techSource) {
		this.techSource = techSource;
	}
	public String getTechLevel() {
		return techLevel;
	}
	public void setTechLevel(String techLevel) {
		this.techLevel = techLevel;
	}
	public String getMatureLevel() {
		return matureLevel;
	}
	public void setMatureLevel(String matureLevel) {
		this.matureLevel = matureLevel;
	}
	public String getApplicationProduct() {
		return applicationProduct;
	}
	public void setApplicationProduct(String applicationProduct) {
		this.applicationProduct = applicationProduct;
	}
	public String getMainCustom() {
		return mainCustom;
	}
	public void setMainCustom(String mainCustom) {
		this.mainCustom = mainCustom;
	}
}
