package room.escape.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Review;
import room.escape.service.ReviewService;

@SpringBootTest
class SelectTests {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		Review obj = null;

		try{
			obj = service.get(2);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
