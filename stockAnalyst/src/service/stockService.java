package service;

import java.util.List;
import java.util.Map;

import pojo.CompanyInfo;
import pojo.CompanyResult;
import pojo.CompanyRisk;

public interface stockService {
	public String[] selectAllCompany();
	public CompanyInfo selectInfoByCompanyName(Map<String, Object> map);
	
	public CompanyResult selectResultByCompanyName(Map<String, Object> map);
	public List<CompanyRisk> selectRiskByCompanyName(Map<String, Object> map);
	
}
