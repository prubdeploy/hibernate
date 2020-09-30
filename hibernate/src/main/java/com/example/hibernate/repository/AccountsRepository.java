package com.example.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hibernate.model.Accounts;
import com.example.hibernate.model.AccountsPK;


public interface AccountsRepository extends JpaRepository<Accounts, AccountsPK>{
	@Query("select acct from Accounts acct where acct.accPK.accType =:acctType")
	 List<Accounts> findByType(@Param("acctType")String acctType);
	
	
	 List<Accounts> findByAccountDescription(String acctdesc);
	

}
