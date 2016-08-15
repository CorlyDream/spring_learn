package spittr.web;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spittr.service.DefaultValueService;

@Controller
public class HomeController {
	
	@Autowired
	private DefaultValueService defaultValueService;
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Object findList(){
		return new PageInfo<>(defaultValueService.getDefaultValues(10));
	}
}
