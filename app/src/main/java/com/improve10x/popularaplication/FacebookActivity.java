package com.improve10x.popularaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FacebookActivity extends AppCompatActivity {
    FacebookItem[] facebookItems;
    ListView fbNotificationLv;
    FacebookItemAdapter facebookItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        fbNotificationLv = findViewById(R.id.fb_notification_lv);
    }

    public void createData() {
        facebookItems = new FacebookItem[7];

        facebookItems[0] = new FacebookItem();
        facebookItems[0].name = "Angele jaemi Favorito Huit reacted to your story.";
        facebookItems[0].notification = "1 hour ago";
        facebookItems[0].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookItems[1] = new FacebookItem();
        facebookItems[1].name = "Kimwana Michael, Linh An and Channell Boxley asked to join I Love still Life painting";
        facebookItems[1].notification = "1 hour ago";
        facebookItems[1].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookItems[2] = new FacebookItem();
        facebookItems[2].name = "Lloyd Cafe Cadena is live now: Lapit NA MAG END OF SEASON!!!.";
        facebookItems[2].notification = "5 minutes ago";
        facebookItems[2].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookItems[3] = new FacebookItem();
        facebookItems[3].name = "Sai Ellise Mejorada commented on a post in Hachi,s buy abd Sell group.";
        facebookItems[3].notification = "1 hour ago";
        facebookItems[3].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookItems[4] = new FacebookItem();
        facebookItems[4].name = "Mavreen Anne Romero and others added to their stories.";
        facebookItems[4].notification = "2 hour ago";
        facebookItems[4].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookItems[5] = new FacebookItem();
        facebookItems[5].name = "Sosy Sophie, Rompage Traveland Tours and LetstricEcarg Nodner Nillilam listed in CAMSUR...";
        facebookItems[5].notification = "2 hour ago";
        facebookItems[5].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookItems[6] = new FacebookItem();
        facebookItems[6].name = "Bobby Alvarez and others added to theire stories.";
        facebookItems[6].notification = "2 hour ago";
        facebookItems[6].profileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
    }

    public void createAdapter(){
        facebookItemAdapter = new FacebookItemAdapter(facebookItems);
    }

    public void connectAdapter(){
        fbNotificationLv.setAdapter(facebookItemAdapter);
    }
}