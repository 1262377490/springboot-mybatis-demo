package com.test.demo.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.demo.dao.ClothesMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class mapperTest {
     @Autowired
     ClothesMapper clothesMapper;
    
     @Test
     public void test() {
    	 System.out.println(clothesMapper.selectByExample(null).toString());
     }
}
