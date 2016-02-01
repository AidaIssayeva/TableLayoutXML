package com.example.adityanarayan.tablelayoutxml;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText lastName;
    EditText age;
    Button save;
    Button cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.et_name);
        lastName=(EditText)findViewById(R.id.et_last_name);
        age=(EditText) findViewById(R.id.et_age);
        save=(Button) findViewById(R.id.save);
        cancel=(Button) findViewById(R.id.cancel);
        final AlertDialog alertDialog=new AlertDialog.Builder(this).create();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.setTitle("Saved Info");
                String message="";
                message+=name.getText().toString()+ "\n"+lastName.getText().toString()+ "\n"+ age.getText().toString();
                alertDialog.setMessage(message);
                alertDialog.show();
                name.setText("");
                lastName.setText("");
                age.setText("");
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.setTitle("Cancel");
                alertDialog.setMessage("Info cancelled");
                name.setText("");
                alertDialog.show();
                lastName.setText("");
                age.setText("");
            }
        });




    }
}
