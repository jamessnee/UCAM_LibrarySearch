package uk.ac.cam.jas250.ucam_librarysearch.model;

public class RecordLocation {
	private String title;
	private String subtitle;
	private String libraryName;
	private float longitude;
	private float latitude;
	
	public static String[] getLibraryNames(){
		return new String[0];
	}
	
	public static String[] getLibraryLocations(){
		return new String[0];
	}

	//ACCESSORS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	
}
