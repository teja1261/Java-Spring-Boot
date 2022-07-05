package com.stg.modal;

import java.util.List;

public class BranchMaster {

	private String branchId;
	private String branchName;
	private String branchCity;
	private List<AccountMaster> accountMasters;

	public BranchMaster() {
		super();
	}

	public BranchMaster(String branchId, String branchName, String branchCity) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCity = branchCity;
	}

	public BranchMaster(String branchId, String branchName, String branchCity, List<AccountMaster> accountMasters) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCity = branchCity;
		this.accountMasters = accountMasters;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public List<AccountMaster> getAccountMasters() {
		return accountMasters;
	}

	public void setAccountMasters(List<AccountMaster> accountMasters) {
		this.accountMasters = accountMasters;
	}
}
