package com.keem.myapp.members;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class MembersDTO {
	private String birth;

	public String getBirth() {
		String startDate="";
		String endDate="";
		
		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
		SimpleDateFormat afterFormat= new SimpleDateFormat("yyyy-mm-dd");
		Date tempDate = null;
		Date tempDate2=null;
		
	
		return birth;
	}

	public void setBirth(String birth) {
		
		this.birth = birth;
	}
	
	
}
