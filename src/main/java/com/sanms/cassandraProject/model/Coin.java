package com.sanms.cassandraProject.model;

public class Coin {

	private String numberCoin;
	private String typeCoin;

	public String getNumberCoin() {
		return numberCoin;
	}

	public void setNumberCoin(String numberCoin) {
		this.numberCoin = numberCoin;
	}

	public String getTypeCoin() {
		return typeCoin;
	}

	public void setTypeCoin(String typeCoin) {
		this.typeCoin = typeCoin;
	}

	@Override
	public String toString() {
		return "Coin [numberCoin=" + numberCoin + ", typeCoin=" + typeCoin + "]";
	}

}
