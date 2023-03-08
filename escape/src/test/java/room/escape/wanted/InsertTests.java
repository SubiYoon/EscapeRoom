package room.escape.wanted;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Wanted;
import room.escape.service.WantedService;

@SpringBootTest
class InsertTests {
	@Autowired
	WantedService service;

	@Test
	void contextLoads() {
		Wanted obj = new Wanted(0, 1, 2, "멤버구합니다.", "공포테마 방탈출 3명 구해요!", null, null, 60);
		
        try{
            service.register(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
