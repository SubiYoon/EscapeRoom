package room.escape.theme;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.service.ThemeService;

@SpringBootTest
class DeleteTests {
	@Autowired
	ThemeService service;

	@Test
	void contextLoads() {
        try{
            service.remove(9);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
