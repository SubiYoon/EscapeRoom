package room.escape.qna;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Qna;
import room.escape.service.QnaService;

@SpringBootTest
class SelectTests {
	@Autowired
	QnaService service;

	@Test
	void contextLoads() {
		
		Qna obj = null;

		try{
			obj = service.get(2);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
