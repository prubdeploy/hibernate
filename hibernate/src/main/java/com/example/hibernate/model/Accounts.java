package com.example.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table (name="accounts")
public class Accounts implements Serializable{
	@EmbeddedId
	AccountsPK accPK ;
	
		@Column(name="account_des")
		String accountDescription;
		
		

		public AccountsPK getAccPK() {
			return accPK;
		}

		public void setAccPK(AccountsPK accPK) {
			this.accPK = accPK;
		}

		public String getAccountDes() {
			return accountDescription;
		}

		public void setAccountDes(String accountDes) {
			this.accountDescription = accountDes;
		}

		
		

}
