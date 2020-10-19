package com.lovineoduor.bloodbankapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi.BloodBank;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BloodBankActivity<progressBar> extends AppCompatActivity {
    private static final String TAG = BloodBankActivity.class.getSimpleName();

    @BindView(R.id.donationTextView) TextView mdonationTextView;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.requestView) TextView mrequestTextView;
    @BindView(R.id.progressBar) progressBar mprogressBar;
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank);
        ButterKnife.bind(this);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String bloodbank = ((TextView) view).getText().toString();
                Toast.makeText(BloodBankActivity.this, bloodbank, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent =  getIntent();



    }

            }
        }


}
