package com.auribises.session1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {

    EditText eTxtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting the layout on Activity
        setContentView(R.layout.activity_one);
        System.out.println("ActivityOne - onCreate");

        eTxtName = findViewById(R.id.editText);

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("ActivityOne - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("ActivityOne - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("ActivityOne - onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("ActivityOne - onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("ActivityOne - onStop");
    }

    public void clickHandler(View view){

        //String name = eTxtName.getText().toString();
        //Toast.makeText(this,"You Entered: "+name,Toast.LENGTH_LONG).show();

        Intent intent = new Intent(ActivityOne.this,ActivityTwo.class);

        // Forward Passing

        //1.
        //intent.putExtra("keyName",name);
        //intent.putExtra("keyAge",30);

        //2.
        /*Bundle bundle = new Bundle();
        bundle.putString("keyName",name);
        bundle.putInt("keyAge",30);

        intent.putExtra("keyBundle",bundle);*/

        //3. user defined Object
        /*Person pRef = new Person();
        pRef.name = name;
        pRef.age = 20;

        intent.putExtra("keyPerson",pRef);

        startActivity(intent);*/

        // BackWard Passing
        startActivityForResult(intent,101);
    }

    // BackWard Passing
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 101 && resultCode == 201){
            String name = data.getStringExtra("keyName");
            int age = data.getIntExtra("keyAge",0);

            eTxtName.setText(name+" is "+age+" years old !!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Explicit Way
        /*menu.add(1,101,3,"All Songs");
        menu.add(1,102,1,"Favourites");
        menu.add(1,103,5,"Artists");
        menu.add(2,104,4,"Albums");
        menu.add(2,105,2,"Recently Played");*/

        // Implicit Way
        getMenuInflater().inflate(R.menu.menu_activityone,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        //int gid = item.getGroupId();

        //Toast.makeText(this,"ID's "+id+" - "+gid,Toast.LENGTH_LONG).show();

        switch (id){
            case 101:
                Intent intent = new Intent();
                startActivity(intent);
                break;

            case 102:

                break;

            case 103:

                break;

            case R.id.add:

                break;

            case R.id.delete:

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
