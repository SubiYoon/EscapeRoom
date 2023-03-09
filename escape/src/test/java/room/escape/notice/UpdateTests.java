package room.escape.notice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Notice;
import room.escape.service.NoticeService;

@SpringBootTest
class UpdateTests {
	@Autowired
	NoticeService service;

	@Test
	void contextLoads() {
        Notice obj = new Notice(2, 2, "Update Check", "게시판 내용 수정", null);
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
