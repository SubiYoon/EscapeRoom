package room.escape.notice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Notice;
import room.escape.service.NoticeService;

@SpringBootTest
class SelectTests {
	@Autowired
	NoticeService service;

	@Test
	void contextLoads() {
		
		Notice obj = null;

		try{
			obj = service.get(1);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
