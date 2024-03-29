package com.sanms.cassandraProject;

import java.util.List;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Cluster.Builder;
import com.datastax.driver.core.Session;
import com.sanms.cassandraProject.model.ProcessingCode;

public class CassandraConnector {
	
	private Cluster cluster;

    private Session session;
        

    public void connect(String node, Integer port) {
        Builder b = Cluster.builder().addContactPoint(node);
        
        if (port != null) {
            b.withPort(port);
        }
        
        cluster = b.build();

        session = cluster.connect();
    }
    
    public void createKeySpace(String keySpaceName, String strategyReplication, int replicationFactor) {
    	    	
    	
    	StringBuilder sb = new StringBuilder("CREATE KEYSPACE IF NOT EXISTS ")
				.append(keySpaceName).append(" WITH replication = {")
				.append("'class':'").append(strategyReplication)
				.append("', 'replication_factor':").append(replicationFactor)
				.append("};");

    	String query = sb.toString();
    	session.execute(query);
    }
    
    public void createTable(String keySpace, String tableName, String queryColumns){
    	
    	//DROP
    	dropTable(keySpace, tableName);
    	
    	StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
    			.append(keySpace).append(".").append(tableName).append(queryColumns);
    	
    	//CREATE
    	String query = sb.toString();
    	session.execute(query);
    	System.out.println("CREATED TABLE: " + tableName);
    }
    
    public void dropTable(String keySpace, String tableName) {
    	StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ")
    			.append(keySpace).append(".").append(tableName).append(";");
    	
    	String query = sb.toString();
    	session.execute(query);
    	System.out.println("DROP TABLE: " + tableName);
    }
    
    /**
     * Use method when read JSON file
     * @param model
     * @param columnName
     */
    public void insertDataProcessingCode(String keySpace, List<ProcessingCode> lstProcess, String columnName) {
    	
    	for (ProcessingCode process : lstProcess) {
    		StringBuilder sb = new StringBuilder("INSERT INTO ").append(keySpace).append(".").append(columnName).append("(cod_operation, desc_operation, type_operation)")
    				.append("VALUES ('").append(process.getCod_operacion())
    				.append("', '").append(process.getDesc_operacion())
    				.append("', '").append(process.getTipo_operacion())
    				.append("');");
    		
    		String query = sb.toString();
    		session.execute(query);
    		System.out.println(process);
		}
    }

    public Session getSession() {
        return this.session;
    }

    public void close() {
        session.close();
        cluster.close();
    }

}
