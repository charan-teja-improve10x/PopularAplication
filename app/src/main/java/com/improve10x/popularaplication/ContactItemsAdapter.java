package com.improve10x.popularaplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ContactItemsAdapter extends BaseAdapter {
    ContactsItem[] items;

    public ContactItemsAdapter(ContactsItem[] contactsItems){
        items = contactsItems;
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
        ContactItemViewHolder viewHolder;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.contacts_item,parent,false);
            viewHolder = new ContactItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
           viewHolder = (ContactItemViewHolder) convertView.getTag();
        }
        ContactsItem items= (ContactsItem) getItem(position);
        viewHolder.contactTxt.setText(items.mobileNumber);
        viewHolder.callTimeTxt.setText(items.callTime);
        Picasso.get().load(items.contactUrl).into(viewHolder.contactProfileIv);
        return convertView;
    }
}
