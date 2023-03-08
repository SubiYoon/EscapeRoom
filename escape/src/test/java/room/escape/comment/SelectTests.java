package room.escape.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Comment;
import room.escape.service.CommentService;

@SpringBootTest
class SelectTests {
	@Autowired
	CommentService service;

	@Test
	void contextLoads() {
		Comment obj = null;

		try{
			obj = service.get(1);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
