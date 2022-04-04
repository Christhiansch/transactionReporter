package com.sanms.cassandraProject.model;

public class ProcessingCode {

	private String cod_operacion;
	private String desc_operacion;
	private String tipo_operacion;

	public String getCod_operacion() {
		return cod_operacion;
	}

	public void setCod_operacion(String cod_operacion) {
		this.cod_operacion = cod_operacion;
	}

	public String getDesc_operacion() {
		return desc_operacion;
	}

	public void setDesc_operacion(String desc_operacion) {
		this.desc_operacion = desc_operacion;
	}

	public String getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}

	@Override
	public String toString() {
		return "ProcessingCode [cod_operacion=" + cod_operacion + ", desc_operacion=" + desc_operacion
				+ ", tipo_operacion=" + tipo_operacion + "]";
	}

}
