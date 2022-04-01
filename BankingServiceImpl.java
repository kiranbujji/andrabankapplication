package com.crud.andrabank.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.andrabank.dao.AccuontDao;
import com.crud.andrabank.dto.AccountDetails;
import com.crud.andrabank.repo.AccountRepo;
import com.crud.andrabank.sevice.BankingService;
@Service
public class BankingServiceImpl<accountDao> implements BankingService {
	private List<AccountDetails> al = new ArrayList<>();

	@Autowired
	AccountRepo accountrepo;
	
	@Override
	public AccuontDao  create(AccountDetails ac) {
		// TODO Auto-generated method stub
		ac.setAccountno("9204" + Math.random());
		al.add(ac);
		AccuontDao accountdao =new AccuontDao();
		 accountdao.setAccountbal(ac.getAccountbal());
		 accountdao.setAccountname(ac.getAccountname());
		 accountdao.setAccountno(ac.getAccountno());;
		 accountdao.setPhoneno(ac.getPhoneno());
		 accountdao.setIfsccode(ac.getIfsccode());
		 accountrepo.save( accountdao);
		return null;
	}

	@Override
	public boolean delete(Long acctNo) {
		// TODO Auto-generated method stub
		/*if (!al.isEmpty()) {
			int index = 0;
			for (AccountDetails acc : al) {

				if (acc.getAccountno().equalsIgnoreCase(acctNo)) {
					al.remove(index);
					return true;
				}
				index++;
			}
		}
		return false;*/
		 accountrepo.deleteById(acctNo);
		 return true;
	}
@Override
	public AccuontDao getByAccountno(String acctNo) {
		// TODO Auto-generated method stub
		/*if (!al.isEmpty()) {
			int index = 0;
			for (AccountDetails acc : al) {

				if (acc.getAccountno().equalsIgnoreCase(acctNo)) {
					return al.get(index);
				}
				index++;
			}
		}*/
		return accountrepo.findByAccountno(acctNo);
	}

	@Override
	public List<AccuontDao> getAll() {
		// TODO Auto-generated method stub
		return accountrepo.findAll();
	}

	@Override
	public AccuontDao update(AccountDetails ac) {
		// TODO Auto-generated method stub
		/*if (!al.isEmpty()) {
			int index = 0;
			for (AccountDetails acc : al) {

				if (acc.getAccountno().equalsIgnoreCase(ac.getAccountno())) {
					AccountDetails old = al.get(index);
					old.setAccountname(ac.getAccountname());
					return old;
				}
				index++;
			}
		}*/
		AccuontDao accountDao =new AccuontDao();
		accountDao.setId(ac.getId1());
		accountDao.setAccountbal(ac.getAccountbal());
		accountDao.setAccountname(ac.getAccountname());
		accountDao.setPhoneno(ac.getPhoneno());
		accountDao.setIfsccode(ac.getIfsccode());
		accountrepo.save( accountDao);
		return null;
	}

	
	
}
