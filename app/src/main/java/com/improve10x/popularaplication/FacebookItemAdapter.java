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
        FacebookItemViewHolder viewHolder;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.facebook_item,parent,false);
            viewHolder = new FacebookItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (FacebookItemViewHolder) convertView.getTag();
        }
        FacebookItem item = (FacebookItem) getItem(position);
        viewHolder.fbProfileTxt.setText(item.name);
        viewHolder.notificationTxt.setText(item.notification);
        Picasso.get().load(item.profileUrl).into(viewHolder.fbProfileIv);
        return convertView;
    }
}
