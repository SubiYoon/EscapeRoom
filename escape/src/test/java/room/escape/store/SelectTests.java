package room.escape.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Store;
import room.escape.service.StoreService;

@SpringBootTest
class SelectTests {
	@Autowired
	StoreService service;

	@Test
	void contextLoads() {
		Store obj = null;

		try{
			obj = service.get(2);
			System.out.println(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
