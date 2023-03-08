package room.escape.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Comment;
import room.escape.service.CommentService;

@SpringBootTest
class UpdateTests {
	@Autowired
	CommentService service;

	@Test
	void contextLoads() {
        Comment obj = new Comment(1, 1, 2, 1, "Update check", null);
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
