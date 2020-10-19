package com.lovineoduor.bloodbankapi;

import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi.BloodBank;

import butterknife.BindView;

public class BloodBankActivity<progressBar> extends AppCompatActivity {
    private static final String TAG = BloodBankActivity.class.getSimpleName();

    @BindView(R.id.donationTextView) TextView mdonationTextView;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.requestView) TextView mrequestTextView;
    @BindView(R.id.progressBar) progressBar mprogressBar;


}
