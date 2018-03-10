package com.auribises.session1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityTwo extends AppCompatActivity {

    EditText eTxtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        eTxtName = findViewById(R.id.editText);

        Intent rcv = getIntent();
        //String name = rcv.getStringExtra("keyName");
        //int age = rcv.getIntExtra("keyAge",0);

        //Bundle rcvBun = rcv.getBundleExtra("keyBundle");
        //String name = rcvBun.getString("keyName");
        //int age = rcvBun.getInt("keyAge");

        //Person person = (Person)rcv.getSerializableExtra("keyPerson");

        //eTxtName.setText(person.name+" is "+person.age+" years old");
    }

    public void clickHandler(View view){

        String name = eTxtName.getText().toString();

        Intent data = new Intent();
        data.putExtra("keyName",name);
        data.putExtra("keyAge",28);

        setResult(201,data);

        finish();
    }
}
