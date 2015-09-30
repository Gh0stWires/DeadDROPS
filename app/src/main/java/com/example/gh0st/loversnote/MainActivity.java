package com.example.gh0st.loversnote;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String secPassword;
    //public EditText xmsg = (EditText) findViewById(R.id.editTextBox2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_names);
    }

    public void enterNames(View view){
        EditText nameOne = (EditText) findViewById(R.id.editText1);
        Editable dispName = nameOne.getText();
        EditText nameTwo = (EditText) findViewById(R.id.editText2);
        Editable sdispName = nameTwo.getText();
        EditText  setPassword = (EditText) findViewById(R.id.set_password);
        secPassword = setPassword.getText().toString();

        Intent getMessage = new Intent(this, Message.class);
        getMessage.putExtra("PASSWORD", secPassword);
        getMessage.putExtra("DISP_1", dispName);
        getMessage.putExtra("DISP_2", sdispName);
        startActivity(getMessage);

    }









}
