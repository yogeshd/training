package com.tractor.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class DateAdapter extends XmlAdapter<String, Date> {
	
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	

	@Override
	public Date unmarshal(String date) throws Exception {
		return df.parse(date);
	}

	@Override
	public String marshal(Date date) throws Exception {
		return df.format(date);
	}
}