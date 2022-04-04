package com.sanms.cassandraProject.util;

public class ColumnCoin {
	
	private static final String NUMBER_COIN = "NUMBERCOIN";
	private static final String TYPE_COIN = "TYPECOIN";	
	
	public static String getQueryColumnsCoin() {
		StringBuilder sb = new StringBuilder()
				.append("(")
				.append(NUMBER_COIN).append(" text PRIMARY KEY, ")
				.append(TYPE_COIN).append(" text")
				.append(");");
		
		return sb.toString();
	}
	
}
