package com.nit.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
//dependencies in the form of collection
	private List<String>cities;
	private Map<String,String> employees;
	private Set<String>names;
	 private Properties properties;
	 public void setProperties(Properties properties) {
		this.properties = properties;
	}
	 
	 public Properties getProperties() {
		return properties;
	}
	
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Map<String, String> getEmployees() {
		return employees;
	}
	public void setEmployees(Map<String, String> employees) {
		this.employees = employees;
	}
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "CollectionBean [cities=" + cities + ", employees=" + employees + ", names=" + names + ", properties="
				+ properties + "]";
	}
	
	
	
}
