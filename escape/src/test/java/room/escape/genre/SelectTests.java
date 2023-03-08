package room.escape.genre;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Genre;
import room.escape.service.GenreService;

@SpringBootTest
class SelectTests {
	@Autowired
	GenreService service;

	@Test
	void contextLoads() {
		Genre obj = null;

		try{
			obj = service.get(2);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
