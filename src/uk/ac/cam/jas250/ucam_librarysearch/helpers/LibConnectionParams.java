package uk.ac.cam.jas250.ucam_librarysearch.helpers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import uk.ac.cam.jas250.ucam_librarysearch.model.SearchOptions;

public class LibConnectionParams {
	
	private URL url;
	private SearchOptions searchOptions;
	
	private final String base = "http://www.lib.cam.ac.uk/api/aquabrowser/abSearchThin.cgi?";
	private String searchArg;
	private String branch;
	private String resultsPage;
	private String format;
	
	public LibConnectionParams(SearchOptions searchOptions, String searchArg){
		this.searchOptions = searchOptions;
		
		//Create the initial search url
		this.searchArg = "searchArg="+searchArg+"&";
		
		ArrayList<String> dbSelected = searchOptions.getDbSelected();
		this.branch = "branch="; 
		for(int i=0; i<dbSelected.size();i++){
			this.branch += dbSelected.get(i);
			if(i+1!=dbSelected.size())
				this.branch += ",";
		}
		this.branch += "&";
		
		this.resultsPage += "resultsPage=1&";
		this.format += "format=json";
		
		try{
			reBuildURL();
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
	
	public void reBuildURL() throws MalformedURLException{
		String strUrl = ""+base;
		strUrl += this.searchArg;
		strUrl += this.branch;
		strUrl += this.resultsPage;
		strUrl += this.format;
		
		url = new URL(strUrl);
	}
	
	/*
	 * ACCESSORS
	 */
	public URL getURL(){return url;}
	public SearchOptions getSearchOptions(){return searchOptions;}

	public String getSearchArg() {
		return searchArg;
	}

	public void setSearchArg(String searchArg) {
		this.searchArg = searchArg;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getResultsPage() {
		return resultsPage;
	}

	public void setResultsPage(String resultsPage) {
		this.resultsPage = resultsPage;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getBase() {
		return base;
	}
	
	
	

}
