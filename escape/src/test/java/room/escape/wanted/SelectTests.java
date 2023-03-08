package room.escape.wanted;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Wanted;
import room.escape.service.WantedService;

@SpringBootTest
class SelectTests {
	@Autowired
	WantedService service;

	@Test
	void contextLoads() {
		Wanted obj = null;

		try{
			obj = service.get(1);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
