package com.sanms.cassandraProject;

public class CassandraMethods {
	
	public void createKeyspace(String keyspaceName, String replicationStrategy, int replicationFactor) {
		StringBuilder sb = new StringBuilder("CREATE KEYSPACE IF NOT EXISTS ")
				.append(keyspaceName).append(" WITH replication = {")
				.append("'class':'").append(replicationStrategy)
				.append("', 'replication_factor':").append(replicationFactor)
				.append("};");
		
	}

}
