package room.escape.swap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.service.SwapService;

@SpringBootTest
class DeleteTests {
	@Autowired
	SwapService service;

	@Test
	void contextLoads() {
        try{
            service.remove(2);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
	}

}
