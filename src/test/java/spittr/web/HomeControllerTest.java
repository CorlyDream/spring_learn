package spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import spittr.config.RootConfig;
import spittr.mapper.DefaultValueMapper;

@Transactional(rollbackFor=Exception.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
public class HomeControllerTest {
	@Autowired
	private DefaultValueMapper defaultValueDao;
	
	@Test
	public void testHomePage() throws Exception{
		HomeController homeController = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
	
	@Test
	public void testList(){
		List data = defaultValueDao.findByPage();
		System.out.println(data.size());
	}
}
