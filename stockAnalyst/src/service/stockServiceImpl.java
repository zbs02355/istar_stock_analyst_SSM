package service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.stockDao;
import pojo.CompanyInfo;
import pojo.CompanyResult;
import pojo.CompanyRisk;

@Service("stockServiceImpl")
public class stockServiceImpl implements stockService {
	@Autowired
	private stockDao stockDaoObject;
	
	//查询所有公司名称
	@Override
	public String[] selectAllCompany() {
		//执行查询
		List<CompanyInfo> allCompanyInfo = stockDaoObject.selectAllCompany();
		
		//定义一个数组用来存放公司名称
		String[] allCompanyName_array = new String[allCompanyInfo.size()];
		
		//用于指定数组下标
		byte index = 0;
		
		//
		for (CompanyInfo aCompanyInfo : allCompanyInfo) {
			allCompanyName_array[index] = aCompanyInfo.getCompanyName();
			index++;
		}
		
		//返回公司名字数组
		return allCompanyName_array;
	}
	
	//根据名称查询公司基本信息
	@Override
	public CompanyInfo selectInfoByCompanyName(Map<String, Object> map) {
		//执行查询
		CompanyInfo companyInfo = stockDaoObject.selectInfoByCompanyName(map);
		
		//处理日期
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//获取到注册日期
		String registerDate = companyInfo.getCompanyRegisterDate().toString();
		//转换成中间变量Date类型
		Date date = Date.valueOf(registerDate);
		//格式化日期并写入到公司信息对象中
		companyInfo.setCompanyRegisterDate_string(simpleDateFormat.format(date));

		//返回查询结果
		return companyInfo;
	}
	
	//根据名称查询公司研发信息
	public CompanyResult selectResultByCompanyName(Map<String, Object> map){
		//执行查询
		List<CompanyResult> companyResultList = stockDaoObject.selectResultByCompanyName(map);
		
		//返回查询结果
		return companyResultList.get(0);
	}
	
	//根据名称查询公司风险信息
	public List<CompanyRisk> selectRiskByCompanyName(Map<String, Object> map){
		//执行查询
		List<CompanyRisk> companyRiskList = stockDaoObject.selectRiskByCompanyName(map);
		
		//返回查询结果
		return companyRiskList;
	}
}
