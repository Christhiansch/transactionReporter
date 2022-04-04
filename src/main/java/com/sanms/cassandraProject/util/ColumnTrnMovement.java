package com.sanms.cassandraProject.util;

public class ColumnTrnMovement {
	
	private static final String CUSTOMER = "CUSTOMER";
	private static final String PAN = "PAN";
	private static final String TYPE_PAN = "TYPEPAN";
	private static final String PROCESS_CODE = "PROCESSCODE";
	private static final String TERMINAL = "TERMINAL";
	private static final String CHARGE_ACCOUNT = "CHARGEACCOUNT";
	private static final String CHARGE_COIN = "CHARGECOIN";
	private static final String CHARGE_AMOUNT = "CHARGEAMOUNT";
	private static final String CREDIT_ACCOUNT = "CREDITACCOUNT";
	private static final String CREDIT_COINT = "CREDITCOINT";
	private static final String CREDIT_AMOUNT = "CREDITAMOUNT";
	private static final String MONTH = "MONTH";
	private static final String YEAR = "YEAR";
	private static final String DATE = "DATE";
	private static final String INQUIRY = "INQUIRY";
	private static final String INQUIRY_AMOUNT = "INQUIRYAMT";
	private static final String EXCHANGE_RATE = "EXCHANGE_RATE";
	private static final String BIN_ACQUIRER = "BIN";
	private static final String PROCESSING_CODE = "PROCESSINGCODE";
	private static final String LOCATION = "LOCATION";
	private static final String OPERATION_COIN = "OPERATIONCOIN";
	private static final String EXTORNO = "EXTORNO";
	private static final String OPERATION_NUMBER = "NUMBEROPERATION";
	private static final String RESPONSECODE = "RESPONSECODE";
	private static final String RESPONSEDESCRIPTION = "RESPONSEDESCRP";
	private static final String FORGETCODE = "FORGETCODE";
	
	public static String getQueryColumnTrnMovemnt() {
		
		StringBuilder sb = new StringBuilder()
				.append("(")
				.append(CUSTOMER).append(" text, ")
				.append(PAN).append(" text, ")
				.append(TYPE_PAN).append(" text, ")
				.append(PROCESS_CODE).append(" text, ")
				.append(TERMINAL).append(" text, ")
				.append(CHARGE_ACCOUNT).append(" text, ")
				.append(CHARGE_COIN).append(" text, ")
				.append(CHARGE_AMOUNT).append(" text, ")
				.append(CREDIT_ACCOUNT).append(" text, ")
				.append(CREDIT_COINT).append(" text, ")
				.append(CREDIT_AMOUNT).append(" text, ")
				.append(MONTH).append(" text, ")
				.append(YEAR).append(" text, ")
				.append(DATE).append(" text, ")
				.append(INQUIRY).append(" text, ")
				.append(INQUIRY_AMOUNT).append(" text, ")
				.append(EXCHANGE_RATE).append(" text, ")
				.append(BIN_ACQUIRER).append(" text, ")
				.append(PROCESSING_CODE).append(" text, ")
				.append(LOCATION).append(" text, ")
				.append(OPERATION_COIN).append(" text, ")
				.append(EXTORNO).append(" text, ")
				.append(OPERATION_NUMBER).append(" text, ")
				.append(RESPONSECODE).append(" text, ")
				.append(RESPONSEDESCRIPTION).append(" text, ")
				.append(FORGETCODE).append(" text, ")
				.append(");");
		
		return sb.toString();
		
	}

}
