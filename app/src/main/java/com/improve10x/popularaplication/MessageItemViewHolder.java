package com.improve10x.popularaplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MessageItemViewHolder {
    TextView accountIdTxt;
    TextView messageTxt;
    ImageView dpIv;

    public MessageItemViewHolder(View convertView){
        accountIdTxt = convertView.findViewById(R.id.account_id_txt);
        messageTxt = convertView.findViewById(R.id.account_message_txt);
        dpIv = convertView.findViewById(R.id.dp_iv);
    }
}
