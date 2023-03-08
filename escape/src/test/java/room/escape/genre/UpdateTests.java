package room.escape.genre;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Genre;
import room.escape.service.GenreService;

@SpringBootTest
class UpdateTests {
	@Autowired
	GenreService service;

	@Test
	void contextLoads() {
        Genre obj = new Genre(11, "Update Check");
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
