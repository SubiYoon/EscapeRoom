package room.escape.store;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Store;
import room.escape.service.StoreService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	StoreService service;

	@Test
	void contextLoads() {
		List<Store> list=null;

		try{
			list = service.get();
			for(Store s : list) {
				System.out.println(s);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
