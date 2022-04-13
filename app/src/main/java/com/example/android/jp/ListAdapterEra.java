package com.example.android.jp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListAdapterEra extends RecyclerView.Adapter<ListAdapterEra.ViewHolder> {
    private List<ListElementEra> mData1;
    private LayoutInflater mInflater;
    private Context context;
    static ListAdapterEra.OnItemClickListener1 listener1;

    public interface OnItemClickListener1{
        void onItemClick(ListElementEra item1);
    }





    public ListAdapterEra(List<ListElementEra> itemList, Context context, OnItemClickListener1 listener1 ) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData1 = itemList;
        this.listener1 = listener1;

    }

    @Override
    public int getItemCount(){return mData1.size();}

    @NotNull
    @Override
    public ListAdapterEra.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element_era,null);
        return new ListAdapterEra.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapterEra.ViewHolder holder, final int position){
        holder.cv1.setAnimation(AnimationUtils.loadAnimation(context,R.anim.slide));
        holder.binData1(mData1.get(position));
    }

    public void setItems(List<ListElementEra> items){
        mData1 =items;}

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageViewEra;
        TextView tvEra;
        CardView cv1;

        CardView cv;
        ViewHolder(View itemView){
            super(itemView);
            imageViewEra = itemView.findViewById(R.id.imageViewEra);
            tvEra = itemView.findViewById(R.id.tvEra);
            cv1 = itemView.findViewById(R.id.cv1);

        }

        void binData1 (final ListElementEra item){
            imageViewEra.setImageResource(item.getImageEra());
            tvEra.setText(item.getNameEra());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener1.onItemClick(item);
                }
            });



        }

    }
}
