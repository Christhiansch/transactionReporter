package com.sanms.cassandraProject.model;

import java.time.LocalDate;

public class TransactionMovement {

	private String customer;
	private String pan;
	private String typePan;
	private ProcessingCode processCode;
	private String terminal;
	private String chargeAccount;
	private Coin chargeCoin;
	private Double chargeAmount;
	private String creditAccount;
	private Coin creditCoin;
	private Double creditAmount;
	private Integer month;
	private Integer year;
	private LocalDate date;
	private String inquiry;
	private String inquiryAmount;
	private String exchangeRate;
	private String binAcquirer;
	private ProcessingCode processingCode;
	private String location;
	private String operationCoin;
	private String extorno;
	private String operationNumber;
	private String responseCode;
	private String responseDescription;
	private String forgetCode;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTypePan() {
		return typePan;
	}

	public void setTypePan(String typePan) {
		this.typePan = typePan;
	}

	public ProcessingCode getProcessCode() {
		return processCode;
	}

	public void setProcessCode(ProcessingCode processCode) {
		this.processCode = processCode;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getChargeAccount() {
		return chargeAccount;
	}

	public void setChargeAccount(String chargeAccount) {
		this.chargeAccount = chargeAccount;
	}

	public Coin getChargeCoin() {
		return chargeCoin;
	}

	public void setChargeCoin(Coin chargeCoin) {
		this.chargeCoin = chargeCoin;
	}

	public Double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(Double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}

	public Coin getCreditCoin() {
		return creditCoin;
	}

	public void setCreditCoin(Coin creditCoin) {
		this.creditCoin = creditCoin;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getInquiry() {
		return inquiry;
	}

	public void setInquiry(String inquiry) {
		this.inquiry = inquiry;
	}

	public String getInquiryAmount() {
		return inquiryAmount;
	}

	public void setInquiryAmount(String inquiryAmount) {
		this.inquiryAmount = inquiryAmount;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getBinAcquirer() {
		return binAcquirer;
	}

	public void setBinAcquirer(String binAcquirer) {
		this.binAcquirer = binAcquirer;
	}

	public ProcessingCode getProcessingCode() {
		return processingCode;
	}

	public void setProcessingCode(ProcessingCode processingCode) {
		this.processingCode = processingCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOperationCoin() {
		return operationCoin;
	}

	public void setOperationCoin(String operationCoin) {
		this.operationCoin = operationCoin;
	}

	public String getExtorno() {
		return extorno;
	}

	public void setExtorno(String extorno) {
		this.extorno = extorno;
	}

	public String getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public String getForgetCode() {
		return forgetCode;
	}

	public void setForgetCode(String forgetCode) {
		this.forgetCode = forgetCode;
	}

}
