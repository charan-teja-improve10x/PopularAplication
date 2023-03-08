package com.improve10x.popularaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MessagesActivity extends AppCompatActivity {
    MessageItem[] messageItems;
    ListView messagesLv;
    MessangerItemAdapter messangerItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        messagesLv = findViewById(R.id.messages_lv);
    }

    public void createData() {
        messageItems = new MessageItem[6];

        messageItems[0] = new MessageItem();
        messageItems[0].fbAccountName = "Sam Scott";
        messageItems[0].message = "Hey how's it going";
        messageItems[0].imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messageItems[1] = new MessageItem();
        messageItems[1].fbAccountName = "Mai Tran";
        messageItems[1].message = "Mai sent a sticker";
        messageItems[1].imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messageItems[2] = new MessageItem();
        messageItems[2].fbAccountName = "Emmie Baros";
        messageItems[2].message = "Hi again :)";
        messageItems[2].imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messageItems[3] = new MessageItem();
        messageItems[3].fbAccountName = "Jarge Torres";
        messageItems[3].message = "Can't wait!";
        messageItems[3].imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messageItems[4] = new MessageItem();
        messageItems[4].fbAccountName = "Maria & Soumya";
        messageItems[4].message = "Nice";
        messageItems[4].imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messageItems[5] = new MessageItem();
        messageItems[5].fbAccountName = "Surf Team";
        messageItems[5].message = "See you there 😎";
        messageItems[5].imageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";
    }

    public void createAdapter() {
        messangerItemAdapter = new MessangerItemAdapter(messageItems);
    }

    public void connectAdapter() {
        messagesLv.setAdapter(messangerItemAdapter);
    }
}