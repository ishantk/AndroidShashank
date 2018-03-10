package com.auribises.session1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    //ListView listView;
    //GridView listView;
    RecyclerView recyclerView;
    ArrayList<Manager> managerList;
    //ManagerAdapter managerAdapter;
    ManagerRecyclerAdapter managerAdapter;


    void initViews(){
        //listView = findViewById(R.id.listView);

        recyclerView = findViewById(R.id.recylerView);

        Manager m1 = new Manager(R.drawable.music,"John","+91980987689");
        Manager m2 = new Manager(R.drawable.pb,"Jennie","+9140987689");
        Manager m3 = new Manager(R.drawable.category,"Jim","+9340987689");
        Manager m4 = new Manager(R.drawable.contact,"Jack","+91340987689");
        Manager m5 = new Manager(R.drawable.user,"Joe","+91984556689");
        Manager m6 = new Manager(R.drawable.todo,"Jin","+919809232689");

        managerList = new ArrayList<>();

        managerList.add(m1); //0
        managerList.add(m2);
        managerList.add(m3);
        managerList.add(m4);
        managerList.add(m5);
        managerList.add(m6); //n-1

        //managerAdapter = new ManagerAdapter(this,R.layout.list_item,managerList);
        managerAdapter = new ManagerRecyclerAdapter(this,R.layout.list_item,managerList);

        //listView.setAdapter(managerAdapter);
        //listView.setOnItemClickListener(this);

        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(managerAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Manager manager = managerList.get(i);
        Toast.makeText(this,"You Selected "+manager.name,Toast.LENGTH_LONG).show();

    }
}
