/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanms.cassandraProject.principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.sanms.cassandraProject.model.ProcessingCode;

/**
 *
 * @author sanms
 */
public class InsertJSONData
{
  
	private static final Type PROCESSCODE_TYPE = new TypeToken<List<ProcessingCode>>() {}.getType();
	
  public static void main(String[] args)
  {
    
	/**
	 * Gson Test
	 */
    Gson gsontest = new Gson();
    
    ProcessingCode process1 = new ProcessingCode();
    ProcessingCode process2 = new ProcessingCode();
    
    process1.setCod_operacion("011000");
    process1.setDesc_operacion("RETIRO ATM");
    process1.setTipo_operacion("RETIRO");
    
    process2.setCod_operacion("301000");
    process2.setDesc_operacion("CONSULTA DE SALDO DEB");
    process2.setTipo_operacion("CONSULTA DE SALDO");
    
    List<ProcessingCode> lstProcessCode = new ArrayList<>();
    lstProcessCode.add(process1);
    lstProcessCode.add(process2);
    
    
    String json = gsontest.toJson(lstProcessCode);
    
    //Object to JSON
    //System.out.print(json);
    
    /**
     * Gson Reader
     */
    
    try {
    	    	
    	Gson gsonreader = new Gson();
    	Path path = Paths.get("C:\\csdevelopment\\cassandraProject\\codigo_operacion.json");
    	JsonReader jsonreader = new JsonReader(new FileReader(path.toFile()));
    	List<ProcessingCode> lstProcess = gsonreader.fromJson(jsonreader, PROCESSCODE_TYPE);
    	
    	for(ProcessingCode process: lstProcess) {
    		System.out.println(process);
    	}    	
    	
    	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
    
    
  }
  
}
