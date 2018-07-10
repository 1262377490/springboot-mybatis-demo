package com.test.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.bean.Clothes;
import com.test.demo.dao.ClothesMapper;

@Service
public class ClothService {
	@Autowired
    ClothesMapper clothesMapper;
	
	public List<Clothes> getAll(){
		return clothesMapper.selectByExample(null);
	}
}
