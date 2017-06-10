package com.example.azielinska.takapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.azielinska.takapplication.data_access.CreateTask;
import com.example.azielinska.takapplication.data_access.GetAllClientTasks;
import com.example.azielinska.takapplication.data_access.GetAllTasks;
import com.example.azielinska.takapplication.data_access.GetCategories;
import com.example.azielinska.takapplication.data_model.Category;
import com.example.azielinska.takapplication.data_model.Task_V;
import com.example.azielinska.takapplication.data_model.User;
import com.example.azielinska.takapplication.interfaces.OnDBRequestFinished;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    List<Category> _categoryList = new ArrayList<Category>();
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Date dt = Calendar.getInstance().getTime();

        //CreateTask ct = new CreateTask();
        //ct.InsertTask(1, 1, 1, dt, dt);

        //lv = (ListView) findViewById(R.id.myListView);

        ctx = this;
        //final GetCategories _getCategories = new GetCategories(this);
        //_getCategories.setDBRequestFinishedListener(new OnDBRequestFinished() {
        //    @Override
        //    public void onDBRequestFinished() {
        //        List<Category> _categoryList = _getCategories._categories;
        //    }
        //});

        User u = new User();
        u.set_Id(3);

        final GetAllClientTasks tasks = new GetAllClientTasks(this, u);
        tasks.setDBRequestFinishedListener(new OnDBRequestFinished() {
            @Override
            public void onDBRequestFinished() {

                List<Task_V> tasksList = tasks._tasks;
            }
        });


    }

}
