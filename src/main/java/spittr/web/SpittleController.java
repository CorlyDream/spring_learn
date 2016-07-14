package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.dao.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	private SpittleRepository spitterRepository;
	@Autowired
	public SpittleController(SpittleRepository spittleRepository){
		this.spitterRepository = spittleRepository;
	}
	
	@RequestMapping(method=GET)
	public String spittles(Model model){
		model.addAttribute(spitterRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
}
