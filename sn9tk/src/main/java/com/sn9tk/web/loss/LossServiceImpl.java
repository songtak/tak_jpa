package com.sn9tk.web.loss;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LossServiceImpl implements LossService{
	@Autowired LossDao lossDao;

	@Override
	public List<Loss> findAll() {
		List<Loss> temp = new ArrayList<>();
		return temp;
	}

	@Override
	public Loss findOne(String lossid) {
		return lossDao.selectOne(lossid);
	}

}
