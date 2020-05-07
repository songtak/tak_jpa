package com.sn9tk.web.loss;

import org.springframework.stereotype.Component;
import lombok.Data;


@Component @Data
public class Loss {
	private String lossid, item, date, category, location;
	
}
