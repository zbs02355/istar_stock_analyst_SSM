package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.bcel.internal.generic.NEW;

import pojo.CompanyInfo;
import pojo.CompanyResult;
import pojo.CompanyRisk;
import pojo.RiskChoose;
import pojo.UserChoose;
import service.stockService;

@Controller("indexController")
@RequestMapping("/index")
public class indexController {
	
	@Autowired
	private stockService stockServiceObject;
	
	//创建一个数组用于保存查询出的公司名称
	String[] companyNameArray = null;
	
	//创建一个字符串用于保存所选择的公司名称
	String selectedCompanyName = "";
	
	//创建一个对象用于保存查询出的公司的基本信息
	CompanyInfo companyInfoObject = new CompanyInfo();
	
	//初始化首页
	@RequestMapping("/main")
	public String initMain(Model model) {
		//用于接收用户的选择
		model.addAttribute("userChoose", new UserChoose());
		
		//创建一个数组用于接收查询出的公司名称
		String[] companyName = stockServiceObject.selectAllCompany();
		model.addAttribute("companyName", companyName);
		
		//将查询结果保存到类中
		this.companyNameArray = companyName;

		return "index";
	}
	
	//查询数据
	@RequestMapping("/selectData")
	public String saveUserChoose(@ModelAttribute UserChoose userChoose, Model model, HttpSession session) {
		//为表单添加属性
		model.addAttribute("companyName", this.companyNameArray);
		
		//用于获取用户的选择
		String selectedCompanyName = userChoose.getCompany();
		
		//用于设置SQL语句的参数
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("companyName", selectedCompanyName);
		
		//执行查询
		CompanyInfo companyInfo = stockServiceObject.selectInfoByCompanyName(map);
		CompanyResult companyResult = stockServiceObject.selectResultByCompanyName(map);
		List<CompanyRisk> companyRiskList = stockServiceObject.selectRiskByCompanyName(map);
		
		//测试
		System.out.println("\n查询成功！" + "\ncontroller返回的数据：");
		System.out.println("\t公司名字：" + companyInfo.getCompanyName());
		System.out.println("\n\t发明专利数量：" + companyResult.getInventorNum());
		System.out.println("\n\t研发项目数量：" + companyResult.getDevelopNum());
		for (CompanyRisk aCompanyRisk : companyRiskList) {
			System.out.println("\n\t风险名称：" + aCompanyRisk.getRiskName());
		}
		
		//将查询的结果保存到Session中
		session.setAttribute("companyInfo", companyInfo);
		session.setAttribute("companyResult", companyResult);
		session.setAttribute("companyRiskList", companyRiskList);
		
		//将选择的结果保存到类中
		this.selectedCompanyName = selectedCompanyName;
		
		//将查询出的公司基本信息保存到类中
		this.companyInfoObject = companyInfo;
		
		//测试
		System.out.println("类中的companyName" + this.selectedCompanyName);
		
		//重新接收用户选择参数
		model.addAttribute("userChoose", new UserChoose());
		
		return "index";
		
	}
	
	//查看风险摘要信息
	@RequestMapping("/readRiskSummary")
	@ResponseBody
	public CompanyRisk readRiskSummary(@RequestBody RiskChoose riskChoose, Model model) {
		//测试
		System.out.println("Ajax请求开始执行...");
		System.out.println("riskName:" + riskChoose.getRiskName());
		
		//用于设置SQL语句的参数
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("companyName", this.selectedCompanyName);
		
		//执行查询
		List<CompanyRisk> companyRiskList = stockServiceObject.selectRiskByCompanyName(map);
		
		int i = 0;
		
		for (i = 0; i < companyRiskList.size(); i++) {
			if (companyRiskList.get(i).getRiskName().equals(riskChoose.getRiskName())) {
				break;
			}
		}
		
		CompanyRisk returnCompanyRisk = companyRiskList.get(i);
		
		//返回结果
		return returnCompanyRisk;
	}
	
	//绘制图表
	@RequestMapping("/readGraph")
	@ResponseBody
	public CompanyInfo readGraph() {
		//测试
		System.out.println("Ajax开始执行！");
		
		//用于设置SQL语句的参数
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("companyName", this.selectedCompanyName);
		
		//执行查询
		CompanyInfo companyInfo = stockServiceObject.selectInfoByCompanyName(map);
		
		return companyInfo;
	}
}