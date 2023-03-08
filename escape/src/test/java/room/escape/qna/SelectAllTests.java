package room.escape.qna;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Qna;
import room.escape.service.QnaService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	QnaService service;

	@Test
	void contextLoads() {
		List<Qna> list=null;

		try{
			list = service.get();
			for(Qna q : list) {
				System.out.println(q);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
