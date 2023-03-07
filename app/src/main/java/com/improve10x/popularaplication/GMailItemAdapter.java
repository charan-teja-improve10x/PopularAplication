package com.improve10x.popularaplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.Nullable;

public class GMailItemAdapter extends BaseAdapter {
    public MailItems[] items;

    public GMailItemAdapter(MailItems[] mailItems){
        items = mailItems;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      MailItems items = (MailItems) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.mail_item,parent,false);
        TextView nameTxt = view.findViewById(R.id.name_txt);
        nameTxt.setText(items.name);
        TextView messageTxt = view.findViewById(R.id.message_txt);
        messageTxt.setText(items.message);
        TextView timeTxt = view.findViewById(R.id.time_txt);
        timeTxt.setText(items.time);
        ImageView profileIv = view.findViewById(R.id.profile_iv);
        Picasso.get().load(items.profileUrl).into(profileIv);
        return view;
    }
}
