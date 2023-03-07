package com.improve10x.popularaplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FacebookItemAdapter extends BaseAdapter {
    FacebookItem[] items;

    public FacebookItemAdapter(FacebookItem[] facebookItems){
        items = facebookItems;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        FacebookItem item = (FacebookItem) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_item,parent,false);
        TextView fbProfileTxt = view.findViewById(R.id.fab_name_txt);
        fbProfileTxt.setText(item.name);
        TextView notificationTxt = view.findViewById(R.id.notification_time_txt);
        notificationTxt.setText(item.notification);
        ImageView fbProfileIv = view.findViewById(R.id.fb_profile_iv);
        Picasso.get().load(item.profileUrl).into(fbProfileIv);
        return view;
    }
}
