package room.escape.notice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Notice;
import room.escape.service.NoticeService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	NoticeService service;

	@Test
	void contextLoads() {
		List<Notice> list=null;

		try{
			list = service.get();
			for(Notice n : list) {
				System.out.println(n);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
