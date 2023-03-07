package com.improve10x.popularaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ContactsActivity extends AppCompatActivity {
    public ContactsItem[] contactsItems;
    ContactItemsAdapter contactItemsAdapter;
    ListView contactsLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        contactsLv = findViewById(R.id.contacs_lv);
    }

    public void createData(){
        contactsItems = new ContactsItem[6];

        contactsItems[0] =  new ContactsItem();
        contactsItems[0].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        contactsItems[0].mobileNumber = "+91 9313549611";
        contactsItems[0].callTime = "↙ India, 6 min. ago";

        contactsItems[1] =  new ContactsItem();
        contactsItems[1].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        contactsItems[1].mobileNumber = "WiFi";
        contactsItems[1].callTime = "↩ Mobile, 1 hr. ago";

        contactsItems[2] =  new ContactsItem();
        contactsItems[2].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        contactsItems[2].mobileNumber = "+91 7678605379";
        contactsItems[2].callTime = "↗ India, 22 hr. ago";

        contactsItems[3] =  new ContactsItem();
        contactsItems[3].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        contactsItems[3].mobileNumber = "+91 8130592642";
        contactsItems[3].callTime = "↙ India, 2 days ago";

        contactsItems[4] =  new ContactsItem();
        contactsItems[4].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        contactsItems[4].mobileNumber = "+91 11 4940 2363";
        contactsItems[4].callTime = "↙ New Delhi, 2 days ago";

        contactsItems[5] =  new ContactsItem();
        contactsItems[5].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        contactsItems[5].mobileNumber = "1909";
        contactsItems[5].callTime = "↗ 2 days ago";
    }

    public void createAdapter(){
        contactItemsAdapter = new ContactItemsAdapter(contactsItems);
    }

    public void connectAdapter(){
        contactsLv.setAdapter(contactItemsAdapter);
    }
}