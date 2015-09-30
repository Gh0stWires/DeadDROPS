package com.example.gh0st.loversnote;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Message extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent mainData = getIntent();


        String dispOne = mainData.getStringExtra("DISP_1");
        String dispTwo = mainData.getStringExtra("DISP_2");

        TextView nameOneDisp = (TextView) findViewById(R.id.name1);
        nameOneDisp.setText(dispOne);
        TextView nameTwoDisp = (TextView) findViewById(R.id.name2);
        nameTwoDisp.setText(dispTwo);


    }

    public void hide(View view){
        Intent mainData = getIntent();
        String passData = mainData.getStringExtra("PASSWORD");
        Intent getHide = new Intent(this, Hide.class);
        getHide.putExtra("PASSWORD", passData);
        startActivity(getHide);
    }
}
