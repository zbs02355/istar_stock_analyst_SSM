package pojo;

import java.sql.Date;

/*
 * 用于存放查询的公司基本信息
 */

public class CompanyInfo {
	private int companyID;
	private String companyName;
	private String companyRegisterArea;
	private String companyRepresentative;
	private String companyRegisterAssets;
	private Date companyRegisterDate;
	private String companyRegisterDate_string; //日期的字符形式
	private String companyAddress;
	private String companyYield;
	private String companyBusiness;
	private String companyProtect;
	private String companyAccount;
	private String companyLawyer;
	private String companyAssess;
	private float netProfit_2018;
	private float netProfit_2017;
	private float netProfit_2016;
	private float operateIncome_2018;
	private float operateIncome_2017;
	private float operateIncome_2016;
	private float totalAssets_2018;
	private float totalAssets_2017;
	private float totalAssets_2016;
	private float totalLiability_2018;
	private float totalLiability_2017;
	private float totalLiability_2016;
	private float compositeRate;
	private float shopRate_2018;
	private float shopRate_2017;
	private float shopRate_2016;
	private float totalAssetsCircleRate_2018;
	private float totalAssetsCircleRate_2017;
	private float totalAssetsCircleRate_2016;
	private float assetsRate_2018;
	private float assetsRate_2017;
	private float assetsRate_2016;
	private float assetsLiabilityRate_2018;
	private float assetsLiabilityRate_2017;
	private float assetsLiabilityRate_2016;
	private float equityMultiplier_2018;
	private float equityMultiplier_2017;
	private float equityMultiplier_2016;
	private float roe_2018;
	private float roe_2017;
	private float roe_2016;
	private int companyScore;
	private String finalLevel;
	
	//一些get和set方法
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyRegisterArea() {
		return companyRegisterArea;
	}
	public void setCompanyRegisterArea(String companyRegisterArea) {
		this.companyRegisterArea = companyRegisterArea;
	}
	public String getCompanyRepresentative() {
		return companyRepresentative;
	}
	public void setCompanyRepresentative(String companyRepresentative) {
		this.companyRepresentative = companyRepresentative;
	}
	public String getCompanyRegisterAssets() {
		return companyRegisterAssets;
	}
	public void setCompanyRegisterAssets(String companyRegisterAssets) {
		this.companyRegisterAssets = companyRegisterAssets;
	}
	public Date getCompanyRegisterDate() {
		return companyRegisterDate;
	}
	public void setCompanyRegisterDate(Date companyRegisterDate) {
		this.companyRegisterDate = companyRegisterDate;
	}
	public String getCompanyRegisterDate_string() {
		return companyRegisterDate_string;
	}
	public void setCompanyRegisterDate_string(String companyRegisterDate_string) {
		this.companyRegisterDate_string = companyRegisterDate_string;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyYield() {
		return companyYield;
	}
	public void setCompanyYield(String companyYield) {
		this.companyYield = companyYield;
	}
	public String getCompanyBusiness() {
		return companyBusiness;
	}
	public void setCompanyBusiness(String companyBusiness) {
		this.companyBusiness = companyBusiness;
	}
	public String getCompanyProtect() {
		return companyProtect;
	}
	public void setCompanyProtect(String companyProtect) {
		this.companyProtect = companyProtect;
	}
	public String getCompanyAccount() {
		return companyAccount;
	}
	public void setCompanyAccount(String companyAccount) {
		this.companyAccount = companyAccount;
	}
	public String getCompanyLawyer() {
		return companyLawyer;
	}
	public void setCompanyLawyer(String companyLawyer) {
		this.companyLawyer = companyLawyer;
	}
	public String getCompanyAssess() {
		return companyAssess;
	}
	public void setCompanyAssess(String companyAssess) {
		this.companyAssess = companyAssess;
	}
	public float getNetProfit_2018() {
		return netProfit_2018;
	}
	public void setNetProfit_2018(float netProfit_2018) {
		this.netProfit_2018 = netProfit_2018;
	}
	public float getNetProfit_2017() {
		return netProfit_2017;
	}
	public void setNetProfit_2017(float netProfit_2017) {
		this.netProfit_2017 = netProfit_2017;
	}
	public float getNetProfit_2016() {
		return netProfit_2016;
	}
	public void setNetProfit_2016(float netProfit_2016) {
		this.netProfit_2016 = netProfit_2016;
	}
	public float getOperateIncome_2018() {
		return operateIncome_2018;
	}
	public void setOperateIncome_2018(float operateIncome_2018) {
		this.operateIncome_2018 = operateIncome_2018;
	}
	public float getOperateIncome_2017() {
		return operateIncome_2017;
	}
	public void setOperateIncome_2017(float operateIncome_2017) {
		this.operateIncome_2017 = operateIncome_2017;
	}
	public float getOperateIncome_2016() {
		return operateIncome_2016;
	}
	public void setOperateIncome_2016(float operateIncome_2016) {
		this.operateIncome_2016 = operateIncome_2016;
	}
	public float getTotalAssets_2018() {
		return totalAssets_2018;
	}
	public void setTotalAssets_2018(float totalAssets_2018) {
		this.totalAssets_2018 = totalAssets_2018;
	}
	public float getTotalAssets_2017() {
		return totalAssets_2017;
	}
	public void setTotalAssets_2017(float totalAssets_2017) {
		this.totalAssets_2017 = totalAssets_2017;
	}
	public float getTotalAssets_2016() {
		return totalAssets_2016;
	}
	public void setTotalAssets_2016(float totalAssets_2016) {
		this.totalAssets_2016 = totalAssets_2016;
	}
	public float getTotalLiability_2018() {
		return totalLiability_2018;
	}
	public void setTotalLiability_2018(float totalLiability_2018) {
		this.totalLiability_2018 = totalLiability_2018;
	}
	public float getTotalLiability_2017() {
		return totalLiability_2017;
	}
	public void setTotalLiability_2017(float totalLiability_2017) {
		this.totalLiability_2017 = totalLiability_2017;
	}
	public float getTotalLiability_2016() {
		return totalLiability_2016;
	}
	public void setTotalLiability_2016(float totalLiability_2016) {
		this.totalLiability_2016 = totalLiability_2016;
	}
	public float getCompositeRate() {
		return compositeRate;
	}
	public void setCompositeRate(float compositeRate) {
		this.compositeRate = compositeRate;
	}
	public float getShopRate_2018() {
		return shopRate_2018;
	}
	public void setShopRate_2018(float shopRate_2018) {
		this.shopRate_2018 = shopRate_2018;
	}
	public float getShopRate_2017() {
		return shopRate_2017;
	}
	public void setShopRate_2017(float shopRate_2017) {
		this.shopRate_2017 = shopRate_2017;
	}
	public float getShopRate_2016() {
		return shopRate_2016;
	}
	public void setShopRate_2016(float shopRate_2016) {
		this.shopRate_2016 = shopRate_2016;
	}
	public float getTotalAssetsCircleRate_2018() {
		return totalAssetsCircleRate_2018;
	}
	public void setTotalAssetsCircleRate_2018(float totalAssetsCircleRate_2018) {
		this.totalAssetsCircleRate_2018 = totalAssetsCircleRate_2018;
	}
	public float getTotalAssetsCircleRate_2017() {
		return totalAssetsCircleRate_2017;
	}
	public void setTotalAssetsCircleRate_2017(float totalAssetsCircleRate_2017) {
		this.totalAssetsCircleRate_2017 = totalAssetsCircleRate_2017;
	}
	public float getTotalAssetsCircleRate_2016() {
		return totalAssetsCircleRate_2016;
	}
	public void setTotalAssetsCircleRate_2016(float totalAssetsCircleRate_2016) {
		this.totalAssetsCircleRate_2016 = totalAssetsCircleRate_2016;
	}
	public float getAssetsRate_2018() {
		return assetsRate_2018;
	}
	public void setAssetsRate_2018(float assetsRate_2018) {
		this.assetsRate_2018 = assetsRate_2018;
	}
	public float getAssetsRate_2017() {
		return assetsRate_2017;
	}
	public void setAssetsRate_2017(float assetsRate_2017) {
		this.assetsRate_2017 = assetsRate_2017;
	}
	public float getAssetsRate_2016() {
		return assetsRate_2016;
	}
	public void setAssetsRate_2016(float assetsRate_2016) {
		this.assetsRate_2016 = assetsRate_2016;
	}
	public float getAssetsLiabilityRate_2018() {
		return assetsLiabilityRate_2018;
	}
	public void setAssetsLiabilityRate_2018(float assetsLiabilityRate_2018) {
		this.assetsLiabilityRate_2018 = assetsLiabilityRate_2018;
	}
	public float getAssetsLiabilityRate_2017() {
		return assetsLiabilityRate_2017;
	}
	public void setAssetsLiabilityRate_2017(float assetsLiabilityRate_2017) {
		this.assetsLiabilityRate_2017 = assetsLiabilityRate_2017;
	}
	public float getAssetsLiabilityRate_2016() {
		return assetsLiabilityRate_2016;
	}
	public void setAssetsLiabilityRate_2016(float assetsLiabilityRate_2016) {
		this.assetsLiabilityRate_2016 = assetsLiabilityRate_2016;
	}
	public float getEquityMultiplier_2018() {
		return equityMultiplier_2018;
	}
	public void setEquityMultiplier_2018(float equityMultiplier_2018) {
		this.equityMultiplier_2018 = equityMultiplier_2018;
	}
	public float getEquityMultiplier_2017() {
		return equityMultiplier_2017;
	}
	public void setEquityMultiplier_2017(float equityMultiplier_2017) {
		this.equityMultiplier_2017 = equityMultiplier_2017;
	}
	public float getEquityMultiplier_2016() {
		return equityMultiplier_2016;
	}
	public void setEquityMultiplier_2016(float equityMultiplier_2016) {
		this.equityMultiplier_2016 = equityMultiplier_2016;
	}
	public float getRoe_2018() {
		return roe_2018;
	}
	public void setRoe_2018(float roe_2018) {
		this.roe_2018 = roe_2018;
	}
	public float getRoe_2017() {
		return roe_2017;
	}
	public void setRoe_2017(float roe_2017) {
		this.roe_2017 = roe_2017;
	}
	public float getRoe_2016() {
		return roe_2016;
	}
	public void setRoe_2016(float roe_2016) {
		this.roe_2016 = roe_2016;
	}
	public int getCompanyScore() {
		return companyScore;
	}
	public void setCompanyScore(int companyScore) {
		this.companyScore = companyScore;
	}
	public String getFinalLevel() {
		return finalLevel;
	}
	public void setFinalLevel(String finalLevel) {
		this.finalLevel = finalLevel;
	}
}
