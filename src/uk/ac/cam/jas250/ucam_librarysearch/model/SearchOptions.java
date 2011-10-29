package uk.ac.cam.jas250.ucam_librarysearch.model;

import java.util.ArrayList;

public class SearchOptions {
	private ArrayList<String> dbSelected;
	private Integer numPagesSelected;
	
	public void addDatabase(String db){
		dbSelected.add(db);
	}
	
	public void removeDatabase(String db){
		dbSelected.remove(db);
	}
	
	//ACCESSORS
	public ArrayList<String> getDbSelected() {
		return dbSelected;
	}
	public void setDbSelected(ArrayList<String> dbSelected) {
		this.dbSelected = dbSelected;
	}
	public Integer getNumPagesSelected() {
		return numPagesSelected;
	}
	public void setNumPagesSelected(Integer numPagesSelected) {
		this.numPagesSelected = numPagesSelected;
	}
	
	
}
