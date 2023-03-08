package room.escape.swap;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Swap;
import room.escape.service.SwapService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	SwapService service;

	@Test
	void contextLoads() {
		List<Swap> list=null;

		try{
			list = service.get();
			for(Swap s : list) {
				System.out.println(s);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
