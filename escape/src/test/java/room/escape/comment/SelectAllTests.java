package room.escape.comment;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Comment;
import room.escape.service.CommentService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	CommentService service;

	@Test
	void contextLoads() {
		List<Comment> list=null;

		try{
			list = service.get();
			for(Comment c : list) {
				System.out.println(c);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
