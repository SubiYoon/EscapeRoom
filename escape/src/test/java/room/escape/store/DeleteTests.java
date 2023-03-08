package room.escape.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.service.StoreService;

@SpringBootTest
class DeleteTests {
	@Autowired
	StoreService service;

	@Test
	void contextLoads() {
        try{
            service.remove(3);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
