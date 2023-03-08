package room.escape.theme;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Theme;
import room.escape.service.ThemeService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	ThemeService service;

	@Test
	void contextLoads() {
		List<Theme> list=null;

		try{
			list = service.get();
			for(Theme t : list) {
				System.out.println(t);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
