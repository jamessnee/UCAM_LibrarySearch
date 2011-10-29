package uk.ac.cam.jas250.ucam_librarysearch.model;

public class Entry {
	private String author;
	private String title;
	private String edition;
	private String isbn;
	
	private String bibId;
	private String coverImageURL;
	private String database;
	private String pubDate;
	
	private String[] libraryCodes;
	private String[] normalisedCallNos;
	private String[] locationCodes;
	private String[] locationNames;
	private String[] callNos;
	
	//Accessors
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBibId() {
		return bibId;
	}
	public void setBibId(String bibId) {
		this.bibId = bibId;
	}
	public String getCoverImageURL() {
		return coverImageURL;
	}
	public void setCoverImageURL(String coverImageURL) {
		this.coverImageURL = coverImageURL;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String[] getLibraryCodes() {
		return libraryCodes;
	}
	public void setLibraryCodes(String[] libraryCodes) {
		this.libraryCodes = libraryCodes;
	}
	public String[] getNormalisedCallNos() {
		return normalisedCallNos;
	}
	public void setNormalisedCallNos(String[] normalisedCallNos) {
		this.normalisedCallNos = normalisedCallNos;
	}
	public String[] getLocationCodes() {
		return locationCodes;
	}
	public void setLocationCodes(String[] locationCodes) {
		this.locationCodes = locationCodes;
	}
	public String[] getLocationNames() {
		return locationNames;
	}
	public void setLocationNames(String[] locationNames) {
		this.locationNames = locationNames;
	}
	public String[] getCallNos() {
		return callNos;
	}
	public void setCallNos(String[] callNos) {
		this.callNos = callNos;
	}

	
	
}
