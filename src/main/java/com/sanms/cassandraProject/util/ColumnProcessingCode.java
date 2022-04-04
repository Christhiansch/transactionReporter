package com.sanms.cassandraProject.util;

public class ColumnProcessingCode {
	
	private static final String COD_OPERATION = "COD_OPERATION";
	private static final String DESC_OPERATION = "DESC_OPERATION";
	private static final String TYPE_OPERATION = "TYPE_OPERATION";
	
	public static String getQueryColumnsProcessingCode() {
		StringBuilder sb = new StringBuilder()
				.append("(")
				.append(COD_OPERATION).append(" text PRIMARY KEY, ")
				.append(DESC_OPERATION).append(" text, ")
				.append(TYPE_OPERATION).append(" text")
				.append(");");
		
		return sb.toString();
	}

}
