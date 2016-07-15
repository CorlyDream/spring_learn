package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import spittr.mapper.DefaultValueMapper;

@Controller
public class HomeController {
	
	@Autowired
	private DefaultValueMapper defaultValueDao;
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Object findList(){
		PageHelper.startPage(1, 10);
		return new PageInfo<>(defaultValueDao.findByPage());
	}
}
