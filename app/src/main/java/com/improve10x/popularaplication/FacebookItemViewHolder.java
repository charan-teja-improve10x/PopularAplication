package com.improve10x.popularaplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FacebookItemViewHolder {
    TextView fbProfileTxt;
    TextView notificationTxt;
    ImageView fbProfileIv;

    public FacebookItemViewHolder(View convertView){
        fbProfileTxt = convertView.findViewById(R.id.fab_name_txt);
        notificationTxt = convertView.findViewById(R.id.notification_time_txt);
        fbProfileIv = convertView.findViewById(R.id.fb_profile_iv);
    }
}
