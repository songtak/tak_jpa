package com.sn9tk.web.loss;

import java.util.List;

public interface LossService {

	public List<Loss> findAll();

	public Loss findOne(String lossid);

}
