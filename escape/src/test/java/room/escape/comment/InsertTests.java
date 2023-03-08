package room.escape.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Comment;
import room.escape.service.CommentService;

@SpringBootTest
class InsertTests {
	@Autowired
	CommentService service;

	@Test
	void contextLoads() {
		Comment obj = new Comment(0, 1, 2, 1, "또 놀자", null);
		
        try{
            service.register(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
