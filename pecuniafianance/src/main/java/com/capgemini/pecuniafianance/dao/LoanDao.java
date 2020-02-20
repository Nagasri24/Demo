package com.capgemini.pecuniafianance.dao;

import java.util.List;

import com.capgemini.pecuniafianance.bean.Loan;
import com.capgemini.pecuniafianance.exception.LoanException;

public interface LoanDao {
	
	public Loan addLoanDetails(String accountId, double amount, int tenure, double rateOfInterest, int creditScore ) throws LoanException;
	public String createLoanRequest(Loan loan) throws LoanException;
	public List<Loan> loanRequestList() throws LoanException;
	public List<Loan> loanApprovalList(Loan loan) throws LoanException;
	public String loanApprovalStatus(Loan loan) throws LoanException;
	public double calculateEmiForLoan(Loan loan) throws LoanException;
}