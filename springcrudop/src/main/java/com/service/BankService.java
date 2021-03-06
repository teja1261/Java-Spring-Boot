package com.service;

import java.util.List;

import com.modal.BranchMaster;

public interface BankService {

	public abstract BranchMaster createBankAndAccounts(BranchMaster branchMaster);

	public abstract List<BranchMaster> readAllBankBranchDetails();

	public abstract BranchMaster readByBranchId(String branchId);

	public abstract BranchMaster readByBranchName(String branchName);
}
