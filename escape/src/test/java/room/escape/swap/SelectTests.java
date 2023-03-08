package room.escape.swap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Swap;
import room.escape.service.SwapService;

@SpringBootTest
class SelectTests {
	@Autowired
	SwapService service;

	@Test
	void contextLoads() {
		Swap obj = null;

		try{
			obj = service.get(1);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
