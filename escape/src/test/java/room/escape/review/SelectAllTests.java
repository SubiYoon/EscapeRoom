package room.escape.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Review;
import room.escape.service.ReviewService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		List<Review> list=null;

		try{
			list = service.get();
			for(Review r : list) {
				System.out.println(r);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
