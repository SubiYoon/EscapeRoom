package room.escape.genre;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.service.GenreService;

@SpringBootTest
class DeleteTests {
	@Autowired
	GenreService service;

	@Test
	void contextLoads() {
        try{
            service.remove(10);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
