package com.springboot.elasticsearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Config testing.
 * 
 * @author Rija RAMAMPIANDRA.
 *
 */
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
