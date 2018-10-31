package com.example.aipjamjam.uts_mopro;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListMakanan extends RecyclerView.Adapter<ListMakanan.OriginalViewHolder> {

    private Context context;
    private ArrayList<Makanan> listmakanan;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public ListMakanan(Context context) {
        this.context = context;
    }

    public ArrayList<Makanan> getListmakanan() {
        return listmakanan;
    }

    public void setListmakanan(ArrayList<Makanan> listmakanan) {
        this.listmakanan = listmakanan;
    }

    public OnItemClickListener getmOnItemCLickListener() {
        return mOnItemClickListener;
    }

    public void setmOnItemCLickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @NonNull
    @Override
    public ListMakanan.OriginalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_makanan,
                parent, false);
        return new OriginalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMakanan.OriginalViewHolder holder, int position) {
        holder.tvName.setText(getListmakanan().get(position).getName());
        holder.tvRemarks.setText(getListmakanan().get(position).getRemarks());

        Glide.with(context)
                .load(getListmakanan().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return listmakanan.size();
    }

    class OriginalViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPhoto;
        TextView tvName,tvRemarks;

        public OriginalViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);


        }
    }
}
