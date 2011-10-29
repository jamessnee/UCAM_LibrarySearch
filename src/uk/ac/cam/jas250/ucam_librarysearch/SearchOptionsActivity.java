package uk.ac.cam.jas250.ucam_librarysearch;

import java.util.ArrayList;

import uk.ac.cam.jas250.ucam_librarysearch.model.SearchOptions;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SearchOptionsActivity extends Activity implements OnSeekBarChangeListener,OnClickListener {
	
	//Toggle switches
	ToggleButton tb_ULDep;
	ToggleButton tb_DepFac;
	ToggleButton tb_CollLibs;
	ToggleButton tb_Affil;
	ToggleButton tb_Elec;
	ArrayList<ToggleButton>dbTogles;
	
	SeekBar sb_NumPages;
	TextView txt_NumPages;
	
	Button btn_Back;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchoptions);
        
        //Connect up the UI components
        connectUIElements();
    }
	
	//HELPERS
	private void connectUIElements(){
		tb_ULDep = (ToggleButton)findViewById(R.id.tgl_ULDep);
		tb_ULDep.setTag("UL & Dependents");
		
		tb_DepFac = (ToggleButton)findViewById(R.id.tgl_DepFac);
		tb_DepFac.setTag("Departments and Faculties");
		
		tb_CollLibs = (ToggleButton)findViewById(R.id.tgl_CollLibs);
		tb_CollLibs.setTag("College Libraries");
		
		tb_Affil = (ToggleButton)findViewById(R.id.tgl_Affil);
		tb_Affil.setTag("Affiliated Institutions");
		
		tb_Elec = (ToggleButton)findViewById(R.id.tgl_Elec);
		tb_Elec.setTag("Electronic Resource");
		
		dbTogles = new ArrayList<ToggleButton>();
		dbTogles.add(tb_ULDep);
		dbTogles.add(tb_DepFac);
		dbTogles.add(tb_CollLibs);
		dbTogles.add(tb_Affil);
		dbTogles.add(tb_Elec);
		
		sb_NumPages = (SeekBar)findViewById(R.id.sk_NumPages);
		txt_NumPages = (TextView)findViewById(R.id.txt_NumPages);
		
		btn_Back = (Button)findViewById(R.id.btn_BackFromOptions);
		
		//Hook up action listeners
		sb_NumPages.setOnSeekBarChangeListener(this);
		btn_Back.setOnClickListener(this);
	}

	public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
		txt_NumPages.setText(""+seekBar.getProgress());
	}

	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	public void onStopTrackingTouch(SeekBar seekBar) {
		
	}

	public void onClick(View v) {
		SearchOptions searchOptions = new SearchOptions();
		try{
			searchOptions.setNumPagesSelected(new Integer(txt_NumPages.getText()+""));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		ArrayList<String> dbSelected = new ArrayList<String>();
		for(ToggleButton tgl: dbTogles){
			if(tgl.isSelected()){
				String db = (String) tgl.getTag();
				dbSelected.add(db);
			}
		}
		
		finish();
	}
}
