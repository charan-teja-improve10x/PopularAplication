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
        ContactsItem items= (ContactsItem) getItem(position);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.contacts_item,parent,false);
        TextView contactTxt = view.findViewById(R.id.contact_number_txt);
        contactTxt.setText(items.mobileNumber);
        TextView callTimeTxt = view.findViewById(R.id.calltime_txt);
        callTimeTxt.setText(items.callTime);
        ImageView contactProfileIv = view.findViewById(R.id.contact_profile_iv);
        Picasso.get().load(items.contactUrl).into(contactProfileIv);
        return view;
    }
}
