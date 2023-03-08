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
        MailItemViewHolder viewHolder;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.mail_item,parent,false);
            viewHolder = new MailItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (MailItemViewHolder) convertView.getTag();
        }
      MailItems items = (MailItems) getItem(position);
        viewHolder.nameTxt.setText(items.name);
        viewHolder.messageTxt.setText(items.message);
        viewHolder.timeTxt.setText(items.time);
        Picasso.get().load(items.profileUrl).into(viewHolder.profileIv);
        return convertView;
    }
}
