package uk.ac.cam.jas250.ucam_librarysearch.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import uk.ac.cam.jas250.ucam_librarysearch.model.Entry;

import android.os.AsyncTask;

public class LibConnectionHelper extends AsyncTask<LibConnectionParams, Integer, ArrayList<Entry>> {
	
	@Override
	protected ArrayList<Entry> doInBackground(LibConnectionParams... params) {
		LibConnectionParams lcp = params[0]; //I know that I'm not going to put more than one in, bad yes, quick...yes!
		URL url = lcp.getURL();
		try {
			URLConnection urlCon = url.openConnection();
			
			//Read the data coming in
			BufferedReader in = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
			String data = "";
			String currData;
			while((currData = in.readLine()) != null){
				data += currData; //Build all the data then process it
			}
			return parseJSON(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	protected void onProgressUpdate(Integer progress) {
     
    }
	
	protected void onPostExecute(Long result) {
      
    }
	
	private ArrayList<Entry> parseJSON(String data){
		return null;
	}
}
