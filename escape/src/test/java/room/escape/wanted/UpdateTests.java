package room.escape.wanted;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Wanted;
import room.escape.service.WantedService;

@SpringBootTest
class UpdateTests {
	@Autowired
	WantedService service;

	@Test
	void contextLoads() {
        Wanted obj = new Wanted(1, 1, 2, "Update Check", "게시판 글 수정", null, null, 60);;
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
