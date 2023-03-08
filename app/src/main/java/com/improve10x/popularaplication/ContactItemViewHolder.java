package com.improve10x.popularaplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactItemViewHolder {
    TextView contactTxt;
    TextView callTimeTxt;
    ImageView contactProfileIv;

    public ContactItemViewHolder(View convertView){
        contactTxt = convertView.findViewById(R.id.contact_number_txt);
        callTimeTxt = convertView.findViewById(R.id.calltime_txt);
        contactProfileIv = convertView.findViewById(R.id.contact_profile_iv);
    }
}
