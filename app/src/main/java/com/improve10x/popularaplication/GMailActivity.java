package com.improve10x.popularaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GMailActivity extends AppCompatActivity {
      GMailItemAdapter gMailItemAdapter;
      public MailItems[] mailItems;
      ListView mailLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        mailLv = findViewById(R.id.mail_lv);
    }

    public void createData(){
      mailItems = new MailItems[6];

      mailItems[0] = new MailItems();
      mailItems[0].name = "Lisa Paik";
      mailItems[0].message = "Volunteering at the Lakestone student art... Hi Julia! Thank you for interest in volun...";
      mailItems[0].time = "3:43 PM";
      mailItems[0].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        mailItems[1] = new MailItems();
        mailItems[1].name = "▶ Elena Casarosa";
        mailItems[1].message = "Portrait special! We,d like to announce a holiday portrait spec...";
        mailItems[1].time = "11:24 AM";
        mailItems[1].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        mailItems[2] = new MailItems();
        mailItems[2].name = "Medium Daily Digest";
        mailItems[2].message = "7 Drawing to make you feel better. public... Medium Daily Digest Get Medium for iOS or... ";
        mailItems[2].time = "6:30 AM";
        mailItems[2].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        mailItems[3] = new MailItems();
        mailItems[3].name = "▶ Grace Ellington";
        mailItems[3].message = "Volunteer opportunity I would like to inform you of a volunteer op..";
        mailItems[3].time = "Nov 19";
        mailItems[3].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        mailItems[4] = new MailItems();
        mailItems[4].name = "▶ Henri Rousseau";
        mailItems[4].message = "Niagra falls pictures Julia, Here are the pictures of Niagra Falls y..";
        mailItems[4].time = "Nov 19";
        mailItems[4].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        mailItems[5] = new MailItems();
        mailItems[5].name = "Olenna Mason";
        mailItems[5].message = "Lakestone student art exhibition  You're invited to Lakestone's annual student";
        mailItems[5].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
    }

    public void createAdapter(){
        gMailItemAdapter = new GMailItemAdapter(mailItems);
    }

    public void connectAdapter(){
        mailLv.setAdapter(gMailItemAdapter);
    }
}