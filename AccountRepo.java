package com.crud.andrabank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.andrabank.dao.AccuontDao;

public interface AccountRepo extends JpaRepository<AccuontDao, Long> {
	AccuontDao findByAccountno(String Accountno);
}
