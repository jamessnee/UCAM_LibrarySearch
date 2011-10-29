package uk.ac.cam.jas250.ucam_librarysearch;

import android.app.Activity;
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
		tb_DepFac = (ToggleButton)findViewById(R.id.tgl_DepFac);
		tb_CollLibs = (ToggleButton)findViewById(R.id.tgl_CollLibs);
		tb_Affil = (ToggleButton)findViewById(R.id.tgl_Affil);
		tb_Elec = (ToggleButton)findViewById(R.id.tgl_Elec);
		
		sb_NumPages = (SeekBar)findViewById(R.id.sk_NumPages);
		txt_NumPages = (TextView)findViewById(R.id.txt_NumPages);
		
		btn_Back = (Button)findViewById(R.id.btn_BackFromOptions);
		
		//Hook up action listeners
		sb_NumPages.setOnSeekBarChangeListener(this);
		btn_Back.setOnClickListener(this);
	}

	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		txt_NumPages.setText(""+seekBar.getProgress());
	}

	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	public void onStopTrackingTouch(SeekBar seekBar) {
		
	}

	public void onClick(View v) {
		finish();
	}
}
