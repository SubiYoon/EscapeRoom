package room.escape.qna;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Qna;
import room.escape.service.QnaService;

@SpringBootTest
class UpdateTests {
	@Autowired
	QnaService service;

	@Test
	void contextLoads() {
        Qna obj = new Qna(1, 2, 2, "Update Check", "게시판 내용 수정", null);
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
