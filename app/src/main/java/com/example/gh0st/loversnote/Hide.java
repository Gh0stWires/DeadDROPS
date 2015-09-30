package com.example.gh0st.loversnote;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Hide extends Activity {

    Intent mainPassData = getIntent();
    public String passData = mainPassData.getExtras().getString("PASSWORD");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide);
    }

    public void unhide(View view){
        EditText chkPassword = (EditText) findViewById(R.id.password);
        String check = chkPassword.getText().toString();
        if (check.equals(passData)){
            Intent getMain = new Intent(this, Message.class);
            startActivity(getMain);
        }


    }


}
