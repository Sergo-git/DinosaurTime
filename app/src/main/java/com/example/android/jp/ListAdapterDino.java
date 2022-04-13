package com.example.android.jp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListAdapterDino extends RecyclerView.Adapter<ListAdapterDino.ViewHolder> {
    private List<ListElement> mData;
    private ArrayList<ListElement> fullList;
    private LayoutInflater mInflater;
    private Context context;
    int resourse;
    static ListAdapterDino.OnItemClickListener listener;




    public interface OnItemClickListener{
        void onItemClick(ListElement item);
    }


    public ListAdapterDino(List<ListElement> itemList, Context context, ListAdapterDino.OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
        this.listener = listener;
        //this.resourse = resourse;


    }

    @Override
    public int getItemCount(){return mData.size();}



    @NotNull
    @Override
    public ListAdapterDino.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element,null);
        return new ListAdapterDino.ViewHolder(view);
    }

/*    public View getView(int position, View converView, ViewGroup parent){
        ViewHolder viewHolder;
        if(converView == null){
            converView = mInflater.inflate(this.resourse,parent,false);
            viewHolder = new ViewHolder(converView);
            converView.setTag(viewHolder);
        }

        else viewHolder = (ViewHolder) converView.getTag();
        ListElement element = mData.get(position);
        viewHolder.nameTextView.setText(element.getName());
        viewHolder.iconImageView.setImageResource(element.getImage());

        return converView;

    }*/




    @Override
    public void onBindViewHolder(final ListAdapterDino.ViewHolder holder, final int position){
       holder.cv.setAnimation(AnimationUtils.loadAnimation(context,R.anim.slide));
        holder.binData(mData.get(position));
    }

    public void setItems(List<ListElement> items){
        mData =items;}

        public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImageView;
        TextView nameTextView;
        CardView cv;


        ViewHolder(View itemView){
            super(itemView);
            iconImageView = itemView.findViewById(R.id.iconImageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            cv=itemView.findViewById(R.id.cv);

        }

        void binData (final ListElement item){
            iconImageView.setImageResource(item.getImage());
            nameTextView.setText(item.getName());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);

                }
            });
        }

    }

}
