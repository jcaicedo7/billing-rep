package com.paymentchain.billing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {

	@Test
	public void contextLoads() {
		int n = 3;
		String message = "Prueba de unidad por <JLCG> 1.0.4 vencidad";
		Assert.assertNotNull(message);
		System.out.println(message + n);
	}

}
