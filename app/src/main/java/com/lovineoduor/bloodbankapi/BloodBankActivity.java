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
import com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi.BloodBankApi;
import com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi.BloodClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;

public class BloodBankActivity<progressBar> extends AppCompatActivity {
    private static final String TAG = BloodBankActivity.class.getSimpleName();

    @BindView(R.id.donation)
    TextView mdonationTextView;
    @BindView(R.id.listView)
    ListView mListView;
    @BindView(R.id.request)
    TextView mrequestTextView;
    @BindView(R.id.progressBar)
    progressBar mprogressBar;
    private Object TextView;
    private Object BloodBank;
    private Object Call;
    private Object Response;

    protected void onCreate(Bundle savedInstanceState, String donation, String donate, String request) {
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

        Intent intent = getIntent();
        String donateblood = intent.getStringExtra("bloodbank");
        String requestblood = intent.getStringExtra("bloodbank");

        mdonationTextView.setText("Here is the list of blood donation;" + donate);
        mrequestTextView.setText("Here is the list of blood requests " + request);

        BloodBankApi client = BloodClient.getClient();

        Call<BloodBank> call = client.getdonate(donate, "bloodbank");
        call = client.getrequest(request, "bloodbank");

        call.enqueue((Callback<com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi.BloodBank>) BloodBank);
        {
            @Override
           public void onResponse(Call <BloodBank> call, Response<BloodBank> onResponse) {

        }

        }

    }
}
