package com.springapp.mvc;

import com.springapp.config.JpaConfig;
import com.springapp.model.JpaRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
//@ContextConfiguration(classes = JpaConfig.class)
public class AppTests {

    @Autowired
    JpaRepositoryImpl jpaRepository;

    @Test
    public void simple() throws Exception {
        jpaRepository.findByUsername("artnames");
        assertEquals(5,5);
    }
}
