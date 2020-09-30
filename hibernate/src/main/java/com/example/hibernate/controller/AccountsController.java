package com.example.hibernate.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.model.Accounts;
import com.example.hibernate.model.AccountsPK;
import com.example.hibernate.repository.AccountsRepository;

@RestController
@RequestMapping(value="accounts")
public class AccountsController {
	
		@Autowired
		AccountsRepository accRepo;
		
		@GetMapping(value="/")
		public List<AccountResource> findAll()
		{
			
			
			List<Accounts> acctList= accRepo.findAll();
			
//			List<Accounts> filteredList= new ArrayList<Accounts>();
//			
//			for(Accounts acct : acctList) {
//				if(acct.getAccPK().getAccType().equals("Chequing"))
//					filteredList.add(acct);
//			}
		
//	List<Accounts> filteredList=acctList.stream().filter(a->
//	{
//	return a.getAccPK().getAccType().trim().toUpperCase().equals("CHEQUING");
//	
//	}).collect(Collectors.toList());
//			
			
		//List<String> acctIdList=	acctList.stream().map(a-> a.getAccPK().getAccID()).collect(Collectors.toList());
		
	
		List<AccountResource> acctIdList=	acctList.stream().map(a->
		{
			AccountResource accountResource = new AccountResource();
			accountResource.setAcctName(a.getAccPK().getAccID());
			
			accountResource.setAcctDesc(a.getAccountDes());
			return accountResource;
		}).collect(Collectors.toList());
		
		
//		List<String> upperList= acctIdList.stream().map(String:: toUpperCase).collect(Collectors.toList());
			return acctIdList;
		}
		
		
		@GetMapping(value="/{id}/{acctype}")
		public ResponseEntity<?> findBYID(@PathVariable String  id, @PathVariable String acctype) throws ClassNotFoundException, SQLException{
			//AccountsPK pk= new AccountsPK(id,acctype);
			System.out.println(id + " " + acctype);
		Optional<Accounts> acct= accRepo.findById(new AccountsPK(id,acctype));
		if(acct.isPresent())
			return ResponseEntity.ok(acct.get());
		else 
			 return ResponseEntity.notFound().build();
		
		}
		
		@GetMapping(value="/type/{acctype}")
		public ResponseEntity<?> findByType(@PathVariable String acctype) throws ClassNotFoundException, SQLException{
		List<Accounts> filteredList= accRepo.findByType(acctype.toUpperCase());
		if(filteredList.size() >0)
			return ResponseEntity.ok(filteredList);
		else 
			 return ResponseEntity.notFound().build();
		
		} 
		
		@GetMapping(value="/desc/{accdesc}")
		public ResponseEntity<?> findByDesc(@PathVariable String accdesc) throws ClassNotFoundException, SQLException{
		List<Accounts> filteredList= accRepo.findByAccountDescription(accdesc);
		if(filteredList.size() >0)
			return ResponseEntity.ok(filteredList);
		else 
			 return ResponseEntity.notFound().build();
		
		} 

}
