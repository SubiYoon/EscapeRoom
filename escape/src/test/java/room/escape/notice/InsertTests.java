package room.escape.notice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Notice;
import room.escape.service.NoticeService;

@SpringBootTest
class InsertTests {
	@Autowired
	NoticeService service;

	@Test
	void contextLoads() {
		Notice obj = new Notice(0, 2, "Insert Check", "게시판 내용", null);
		
        try{
            service.register(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
