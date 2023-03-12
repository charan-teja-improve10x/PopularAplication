package com.improve10x.popularaplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MessangerItemAdapter extends BaseAdapter {
    MessageItem[] items;

    public MessangerItemAdapter(MessageItem[] messageItems){
        items = messageItems;
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
        MessageItemViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.message_item,parent,false);
            viewHolder = new MessageItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
           viewHolder = (MessageItemViewHolder) convertView.getTag();
        }
        MessageItem item = (MessageItem) getItem(position);
        viewHolder.accountIdTxt.setText(item.fbAccountName);
        viewHolder.messageTxt.setText(item.message);
        Picasso.get().load(item.imageUrl).into(viewHolder.dpIv);
        return convertView;
    }
}
