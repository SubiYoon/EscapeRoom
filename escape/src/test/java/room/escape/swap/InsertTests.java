package room.escape.swap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Swap;
import room.escape.service.SwapService;

@SpringBootTest
class InsertTests {
	@Autowired
	SwapService service;

	@Test
	void contextLoads() {
		Swap obj = new Swap(0, 2, 2, null, 60);
		
        try{
            service.register(obj);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
