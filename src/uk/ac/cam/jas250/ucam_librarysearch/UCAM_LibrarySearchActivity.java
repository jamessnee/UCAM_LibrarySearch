package uk.ac.cam.jas250.ucam_librarysearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class UCAM_LibrarySearchActivity extends Activity implements OnClickListener{
    
	Button btnSearchOptions;
	Button btnSearch;
	EditText etSearchTerm;
	ProgressBar pbProgress;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Connect up the UI components
        connectUIElements();
    }

	public void onClick(View arg0) {
		Button caller = (Button)arg0;
		if(caller.getId() == R.id.btn_Search){
			startSearch();
		}else if(caller.getId() == R.id.btn_SearchOptions){
			showSearchOptions(arg0);
		}
	}
	
	public void startSearch(){
		pbProgress.setVisibility(1);
		pbProgress.setProgress(50);
	}
	
	public void showSearchOptions(View v){
		//Show the search Options
		Intent i = new Intent(v.getContext(),SearchOptionsActivity.class);
		startActivity(i);
	}
	
	//HELPERS
	private void connectUIElements(){
		btnSearchOptions = (Button)findViewById(R.id.btn_SearchOptions);
		btnSearch = (Button)findViewById(R.id.btn_Search);
		etSearchTerm = (EditText)findViewById(R.id.edTxt_SearchTerm);
		pbProgress = (ProgressBar)findViewById(R.id.pb_SearchProgress);
		
		//Action Listeners for buttons
		btnSearchOptions.setOnClickListener(this);
		btnSearch.setOnClickListener(this);
		
	}
}