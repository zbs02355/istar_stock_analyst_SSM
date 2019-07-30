package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pojo.CompanyInfo;
import pojo.CompanyResult;
import pojo.CompanyRisk;

@Repository("stockDao")
@Mapper
public interface stockDao {
	/*方法名与映射文件元素的ID相对应*/
	
	//查询公司基本信息CompanyInfo
	public List<CompanyInfo> selectAllCompany();
	public CompanyInfo selectInfoByCompanyName(Map<String, Object> map);
	
	//查询公司研发信息CompanyResult
	public List<CompanyResult> selectResultByCompanyName(Map<String, Object> map);
	
	//查询公司风险信息CompanyRisk
	public List<CompanyRisk> selectRiskByCompanyName(Map<String, Object> map);
}
