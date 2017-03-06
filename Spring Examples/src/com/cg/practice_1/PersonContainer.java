package com.cg.practice_1;

import java.util.List;

public class PersonContainer {

	PersonDao dao;
	public PersonDao getDao() {
		return dao;
	}
	public void setDao(PersonDao dao) {
		this.dao = dao;
	}
	public List<Person> getNames(){
		return dao.getNames();
	}
	public int getCount(){
		return dao.getCount();
	}
}
