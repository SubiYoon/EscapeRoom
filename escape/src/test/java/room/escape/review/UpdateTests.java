package room.escape.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Review;
import room.escape.service.ReviewService;

@SpringBootTest
class UpdateTests {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
        Review obj = new Review(1, 2, 1, "Update Check", "게시판 내용 수정", 5, 5, 5, null, 1, 3, 45, null);
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
