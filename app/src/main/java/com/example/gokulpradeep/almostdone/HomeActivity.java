package com.example.gokulpradeep.almostdone;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button saveButton = (Button) findViewById(R.id.button2);
                saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.edit_text_one);
                TextView textView=(TextView)findViewById(R.id.textView2);
                //String valis;
                 //if(sp.getString("userName","Kill").equals(" ")){ valis=sp.getString("userName","Kill");}else{valis="KILL";};
                //textView.setText(valis);
                sp = getSharedPreferences("MyName", Context.MODE_PRIVATE);
                textView.setText(sp.getString("key","KIll"));
                //SharedPreferences.Editor spEditor = sp.edit();
                //spEditor.putString("userName", editText.getText().toString());
                //spEditor.commit();
                            }
        });
    }

}
