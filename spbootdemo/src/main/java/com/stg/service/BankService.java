package com.stg.service;

import java.util.List;

import com.stg.modal.BranchMaster;

public interface BankService {

	public abstract BranchMaster createBankAndAccounts(BranchMaster branchMaster);

	public abstract List<BranchMaster> readAllBankBranchDetails();

	public abstract BranchMaster readByBranchId(String branchId);

	public abstract BranchMaster readByBranchName(String branchName);
}
