package com.heekwoncompany.study018.dao;

import java.util.ArrayList;

import com.heekwoncompany.study018.dto.ContentDto;

public interface IDao {
	
	public void deleteDao(String mid);
	public void writeDao(String mwriter, String mcontent);
	public ArrayList<ContentDto> listDao();
	
}
