package room.escape.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Store;
import room.escape.service.StoreService;

@SpringBootTest
class InsertTests {
	@Autowired
	StoreService service;

	@Test
	void contextLoads() {
		Store obj = new Store(0, 1, "Insert Check", "000-0000-0000", "000", "000");
		
        try{
            service.register(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
