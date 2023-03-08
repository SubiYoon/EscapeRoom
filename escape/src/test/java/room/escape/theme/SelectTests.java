package room.escape.theme;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Theme;
import room.escape.service.ThemeService;

@SpringBootTest
class SelectTests {
	@Autowired
	ThemeService service;

	@Test
	void contextLoads() {
		Theme obj = null;

		try{
			obj = service.get(2);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
