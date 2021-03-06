package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.modal.AccountMaster;
import com.modal.BranchMaster;
import com.modal.CustomerMaster;

@Service
public class BankServiceImpl implements BankService {

	public List<BranchMaster> init() {

		String date = new Date().toString();

		CustomerMaster customerMaster1 = new CustomerMaster(1001, "Teja Narendra", "Visakhapatnam", 1111111111L, date);
		CustomerMaster customerMaster2 = new CustomerMaster(1002, "Srividya Narendra", "Visakhapatnam", 2222222222L, date);
		CustomerMaster customerMaster3 = new CustomerMaster(1003, "Srividya Narendra", "Visakhapatnam", 2222222222L, date);
		CustomerMaster customerMaster4 = new CustomerMaster(1004, "Teja Narendra", "Visakhapatnam", 1111111111L, date);

		List<AccountMaster> accountSbi = new ArrayList<AccountMaster>();
		accountSbi.add(new AccountMaster("SBIN001", 30000.900f, "Saving Account", customerMaster1));
		accountSbi.add(new AccountMaster("SBIN002", 40000.600f, "Saving Account", customerMaster3));

		List<AccountMaster> accountHdfc = new ArrayList<AccountMaster>();
		accountHdfc.add(new AccountMaster("HDFC001", 25000.520f, "Salary Account", customerMaster2));
		accountHdfc.add(new AccountMaster("HDFC002", 25000.560f, "Salary Account", customerMaster4));

		List<BranchMaster> branchMasters = new ArrayList<BranchMaster>();

		branchMasters.add(new BranchMaster("SBI-Visakhapatnam", "SBI", "Visakhapatnam", accountSbi));
		branchMasters.add(new BranchMaster("HDFC-Visakhapatnam", "HDFC", "Visakhapatnam", accountHdfc));

		return branchMasters;
	}

	@Override
	public BranchMaster createBankAndAccounts(BranchMaster branchMaster) {
		return branchMaster;
	}

	@Override
	public List<BranchMaster> readAllBankBranchDetails() {
		return this.init();
	}

	@Override
	public BranchMaster readByBranchId(String branchId) {
		System.out.println(branchId);
		return new BranchMaster("SBI-Visakhapatnam", "SBI", "Visakhapatnam");
	}

	@Override
	public BranchMaster readByBranchName(String branchName) {
		System.out.println(branchName);
		return new BranchMaster("SBI-Visakhapatnam", "SBI", "Visakhapatnam");
	}
}
