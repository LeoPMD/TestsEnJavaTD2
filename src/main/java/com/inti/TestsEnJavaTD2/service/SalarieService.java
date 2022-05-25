package com.inti.TestsEnJavaTD2.service;

import com.inti.TestsEnJavaTD2.model.Salarie;

public interface SalarieService {
	
	Salarie getSalarie (int id);
	void saveSalarie(Salarie s);
	void deleteSalarie (int id);
	void updateSalarie (Salarie s);

}
