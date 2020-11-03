package ui;

import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.lovineoduor.bloodbankapi.R;

public abstract class DonateActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String TAG = "DonateActivity";
    ArrayAdapter<CharSequence> Blood_List;
    ArrayAdapter<CharSequence> City_List;
    ArrayAdapter<CharSequence> Area_List;
    private Object DonerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        // Initialize Arrayadapter from Array resource.

        Blood_List = ArrayAdapter.createFromResource(this,R.array.bg_arrays, android.R.layout.select_dialog_item);
        City_List = ArrayAdapter.createFromResource(this,R.array.city_arrays, android.R.layout.select_dialog_item);
        Area_List = ArrayAdapter.createFromResource(this, R.array.Nairobi_arrays, android.R.layout.select_dialog_item);

        Spinner spinner_blood = (Spinner)findViewById(R.id.spinner_bloodgrp);
        Spinner spinner_city = (Spinner)findViewById(R.id.spinner_city);
        Spinner spinner_area = (Spinner)findViewById(R.id.spinner_area);

        spinner_city.setAdapter(City_List);
        spinner_city.setOnItemSelectedListener(this);
        City_List.getItem(0).toString();

        spinner_blood.setAdapter(Blood_List);
        Blood_List.getItem(0).toString();

        spinner_area.setAdapter(Area_List);
        Area_List.getItem(0).toString();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String city = City_List.getItem(position).toString();
        updateAreaSpinner(city);
        Log.d("info", "onItemSelected: "+city);
    }

    private void updateAreaSpinner(String city) {

        int aid = 0;

        if(city.equals("Nairobi"))
        {
            aid = R.array.Nairobi_arrays;
        }
        else if(city.equals("Mombasa"))
        {
            aid = R.array.Mombasa_arrays;
        }
        else if(city.equals("Kisumu"))
        {
            aid = R.array.Kisumu_arrays;
        }
        else if(city.equals("Nakuru"))
        {
            aid = R.array.Nakuru_arrays;
        }
        else if(city.equals("Nanyuki"))
        {
            aid = R.array.Nanyuki_arrays;
        }
        else if(city.equals("Kericho"))
        {
            aid = R.array.Kericho_arrays;
        }
        else if(city.equals("Turkana"))
        {
            aid = R.array.TUrkana_arrays;
        }
        else if(city.equals("Eldoret"))
        {
            aid = R.array.ELdoret_arrays;
        }
        else if(city.equals("Siaya"))
        {
            aid = R.array.Siaya_arrays;
        }
        else if(city.equals("Meru"))
        {
            aid = R.array.Meru_arrays;
        }
        else if(city.equals("Kakamega"))
        {
            aid = R.array.Kakamega_arrays;
        }
        else if(city.equals("Kiambu"))
        {
            aid = R.array.Kiambu_arrays;
        }
        else if(city.equals("Naivasha"))
        {
            aid = R.array.Naivasha_arrays;
        }

        Area_List = ArrayAdapter.createFromResource(this, aid , android.R.layout.select_dialog_item);
        Spinner spinner_area = (Spinner)findViewById(R.id.spinner_area);
        spinner_area.setAdapter(Area_List);

    }

    public void register(View view)
    {
        String msg = "";

        DonerData donerData = new DonerData();

        donerData.full_name = ((EditText) findViewById(R.id.editText_name)).getText().toString();
        donerData.phone = ((EditText) findViewById(R.id.editText_phone)).getText().toString();
        donerData.email = ((EditText) findViewById(R.id.editText_email)).getText().toString();
        donerData.addr = ((EditText) findViewById(R.id.editText_address)).getText().toString();

        donerData.bloodgrp = ((Spinner)findViewById(R.id.spinner_bloodgrp)).getSelectedItem().toString();
        donerData.city = ((Spinner)findViewById(R.id.spinner_city)).getSelectedItem().toString();
        donerData.area = ((Spinner)findViewById(R.id.spinner_area)).getSelectedItem().toString();

        // Validation of input data

        if(donerData.full_name.isEmpty() || donerData.phone.isEmpty() || donerData.email.isEmpty() ||  donerData.addr.isEmpty())
        {
            msg = "One or Multiple fields are Empty.\nCheck all Fields and try Again.";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher( donerData.email).matches())
        {
            msg = "Invalid E-mail address.";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        }
        else if( donerData.phone.length()<10)
        {
            msg = "Invalid Phone number.";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        }
        else
        {
            // Save data in db

            msg.intern();
            msg = "Successfully, registered as Doner.";
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
            super.onBackPressed();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
