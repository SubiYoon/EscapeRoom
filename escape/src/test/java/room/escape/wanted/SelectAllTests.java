package room.escape.wanted;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import room.escape.dto.Wanted;
import room.escape.service.WantedService;

@SpringBootTest
class SelectAllTests {
	@Autowired
	WantedService service;

	@Test
	void contextLoads() {
		List<Wanted> list=null;

		try{
			list = service.get();
			for(Wanted w : list) {
				System.out.println(w);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
