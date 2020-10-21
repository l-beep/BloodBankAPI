package ui;

import android.app.LauncherActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.lovineoduor.bloodbankapi.R;

import java.util.ArrayList;

import static com.lovineoduor.bloodbankapi.R.*;

public class DonerListActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState, Object dbHelper) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_doner_list);

        String bloodgrp = getIntent().getStringExtra("bloodgrp");
        String city = getIntent().getStringExtra("city");

        ArrayList<DonerData> data = dbHelper.notifyAll();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for (DonerData d:data)
        {
            LauncherActivity.ListItem listitem = new LauncherActivity.ListItem();
            Bundle b = new Bundle();
            b.putInt("Id",d.id);
            b.putString("Name",d.full_name);
            b.putString("City",d.city);
            b.putString("Area",d.area);
            listitem.notifyAll();

            fragmentTransaction.add(id.ListHolder.listitem);
        }

        fragmentTransaction.commit();
    }
}
