package com.projectundikamobile.recyclierview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.devAdapterHolder> {

    ArrayList<getSet> aLDev;

    public adapter(ArrayList<getSet> aLDev) {
        this.aLDev = aLDev;
    }

    @NonNull
    @Override
    public adapter.devAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_dev, parent, false);

        return new devAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.devAdapterHolder holder, int position) {

        holder.dev.setText(aLDev.get(position).getDev());
        holder.lang.setText(aLDev.get(position).getLang());
        holder.desc.setText(aLDev.get(position).getDesc());

    }

    @Override
    public int getItemCount() {

        // atau juga bisa dengan "return aldev.size();" tanpa tanda petik

        return (aLDev != null) ? aLDev.size() : 0;
    }

    public interface AdapterListenesr {
    }

    public class devAdapterHolder extends RecyclerView.ViewHolder {

        private TextView dev, lang, desc;

        public devAdapterHolder(@NonNull View itemView) {
            super(itemView);

            dev  = (TextView) itemView.findViewById(R.id.tv_dev);
            lang = (TextView) itemView.findViewById(R.id.tv_language);
            desc = (TextView) itemView.findViewById(R.id.tv_desc);

        }

    }
}
