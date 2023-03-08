package room.escape.genre;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Genre;
import room.escape.service.GenreService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	GenreService service;

	@Test
	void contextLoads() {
		List<Genre> list=null;

		try{
			list = service.get();
			for(Genre g : list) {
				System.out.println(g);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
