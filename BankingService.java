package com.crud.andrabank.sevice;

import java.util.List;

import com.crud.andrabank.dao.AccuontDao;
import com.crud.andrabank.dto.AccountDetails;



public interface BankingService {
	AccuontDao create(AccountDetails ac);
	
	List<AccuontDao> getAll();
	
	AccuontDao update(AccountDetails ac);

	AccuontDao getByAccountno(String acctNo);

	boolean delete(Long acctNo);

}
