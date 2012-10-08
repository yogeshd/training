package com.tractor.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TimestampAdapter extends XmlAdapter<String, Timestamp> {

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override    
    public Timestamp unmarshal(String timestamp) throws Exception {
        return Timestamp.valueOf(timestamp);
    }

    @Override
    public String marshal(Timestamp timestamp) throws Exception {
        return df.format(timestamp);
    }
}