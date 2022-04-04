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
    
    public void createTable(String tableName, String queryColumns){
    	StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXITS ")
    			.append(tableName).append(queryColumns);
    	
    	String query = sb.toString();
    	session.execute(query);
    }
    
    public void insertDataProcessingCode(List<ProcessingCode> model, String columnName) {
    	
    	for (ProcessingCode processingCode : model) {
    		StringBuilder sb = new StringBuilder("INSERT INTO ").append(columnName).append("(cod_operacion, desc_operacion, tipo_operacion)")
    				.append("VALUES ('").append(processingCode.getCod_operacion())
    				.append("', '").append(processingCode.getDesc_operacion())
    				.append("', '").append(processingCode.getTipo_operacion())
    				.append("');");
    		
    		String query = sb.toString();
    		session.execute(query);
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
