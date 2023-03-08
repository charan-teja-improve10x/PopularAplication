package com.improve10x.popularaplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MailItemViewHolder {
    TextView nameTxt;
    TextView messageTxt;
    TextView timeTxt;
    ImageView profileIv;

    public MailItemViewHolder(View convertView){
        nameTxt = convertView.findViewById(R.id.name_txt);
        messageTxt = convertView.findViewById(R.id.message_txt);
        timeTxt = convertView.findViewById(R.id.time_txt);
        profileIv = convertView.findViewById(R.id.profile_iv);
    }
}
