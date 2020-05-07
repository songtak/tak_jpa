package com.sn9tk.web.loss;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface LossDao {

	public List<Loss> seletAll();

	public Loss selectOne(String lossid);

}
