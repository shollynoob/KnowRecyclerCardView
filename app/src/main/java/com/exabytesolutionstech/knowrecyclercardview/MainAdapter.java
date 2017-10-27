package com.exabytesolutionstech.knowrecyclercardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    ArrayList<RecyclerItem> mContacts;

    public MainAdapter(ArrayList<RecyclerItem> mContacts) {
        this.mContacts = mContacts;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        final RecyclerItem itemList = mContacts.get(position);
        holder.mFullname.setText(itemList.getFullname());
        holder.mLastname.setText(itemList.getLastname());

    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mFullname;
        public TextView mLastname;

        public ViewHolder(View itemView) {
            super(itemView);
            mFullname = (TextView) itemView.findViewById(R.id.full_name);
            mLastname = (TextView) itemView.findViewById(R.id.last_name);

        }
    }
}
