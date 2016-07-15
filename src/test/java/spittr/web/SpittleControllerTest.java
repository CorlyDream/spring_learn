package spittr.web;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.dao.SpittleRepository;
import spittr.entity.DefaultValue;
import spittr.entity.Spittle;
import spittr.mapper.DefaultValueMapper;

public class SpittleControllerTest {
	@Test
	public void shouldShowRecentSpittles() throws Exception{
		List<Spittle> expectedSpittles = createSpittleList(20);
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
		SpittleController controller = new SpittleController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/views/spittles.jsp")).build();
		mockMvc.perform(get("/spittles"))
			.andExpect(view().name("spittles"))
			.andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
	}
	
	
	private List<Spittle> createSpittleList(int count){
		List<Spittle> spittles = new ArrayList<>();
		for(int i=0; i<count; i++){
			spittles.add(new Spittle("Spittle "+i, new Date()));
		}
		return spittles;
	}
	
}
