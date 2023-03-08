package room.escape.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Store;
import room.escape.service.StoreService;

@SpringBootTest
class UpdateTests {
	@Autowired
	StoreService service;

	@Test
	void contextLoads() {
        Store obj = new Store(3, 1, "Update Check", "000-0000-0000", "000", "000");
        
        try{
            service.modify(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
