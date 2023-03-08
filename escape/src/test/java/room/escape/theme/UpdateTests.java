package room.escape.theme;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Theme;
import room.escape.service.ThemeService;

@SpringBootTest
class UpdateTests {
	@Autowired
	ThemeService service;

	@Test
	void contextLoads() {
        Theme obj = new Theme(9, 1, 1, "Update Check", 60, "insert 체크", 2, 4, "낮음", "보통"); 
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
