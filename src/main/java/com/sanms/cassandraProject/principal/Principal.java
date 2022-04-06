package com.sanms.cassandraProject.principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.sanms.cassandraProject.CassandraConnector;
import com.sanms.cassandraProject.model.ProcessingCode;
import com.sanms.cassandraProject.util.ColumnCoin;
import com.sanms.cassandraProject.util.ColumnProcessingCode;
import com.sanms.cassandraProject.util.ColumnTrnMovement;
import com.sanms.cassandraProject.util.Table;

public class Principal {
	
	public static final String KEYSPACENAME = "TRANSACTION_REPORTER";
	private static final Type PROCESSCODE_TYPE = new TypeToken<List<ProcessingCode>>() {}.getType();
	
	public static void main(String[] args) {
		
		CassandraConnector client = new CassandraConnector();
		client.connect("127.0.0.1", 9042);
		
		client.createKeySpace(KEYSPACENAME, "SimpleStrategy", 1);
		
		//CREATE TABLE COIN
		client.createTable(KEYSPACENAME, Table.COIN, ColumnCoin.getQueryColumnsCoin());		
		
		//CREATE TABLE PROCESSINGCODE
		client.createTable(KEYSPACENAME, Table.PROCESSING_CODE, ColumnProcessingCode.getQueryColumnsProcessingCode());		
		
		//CREATE TABLE TRANSACTION_MOVEMENT
		client.createTable(KEYSPACENAME, Table.TRN_MOVEMNT, ColumnTrnMovement.getQueryColumnTrnMovemnt());		
		
		//INSERT DATA PROCESSINGCODE		
		Gson gsonreader = new Gson();
    	Path path = Paths.get("C:\\csdevelopment\\cassandraProject\\codigo_operacion.json");
    	JsonReader jsonreader;
    	
		try {
			
			jsonreader = new JsonReader(new FileReader(path.toFile()));
			List<ProcessingCode> lstProcess = gsonreader.fromJson(jsonreader, PROCESSCODE_TYPE);
			client.insertDataProcessingCode(KEYSPACENAME, lstProcess, Table.PROCESSING_CODE);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
		//INSERT DATA TRANSACTION MOVEMENT
		
		
		client.close();
	}
	
}
