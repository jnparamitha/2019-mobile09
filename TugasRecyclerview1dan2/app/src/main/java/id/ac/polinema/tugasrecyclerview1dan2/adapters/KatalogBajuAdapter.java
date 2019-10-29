package id.ac.polinema.tugasrecyclerview1dan2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

import id.ac.polinema.tugasrecyclerview1dan2.R;
import id.ac.polinema.tugasrecyclerview1dan2.models.KatalogBaju;

public class KatalogBajuAdapter extends RecyclerView.Adapter<KatalogBajuAdapter.MyViewHolder> {
    List<KatalogBaju> bajuList;

    public KatalogBajuAdapter(List<KatalogBaju> bajuList){
        this.bajuList = bajuList;
    }

    @NonNull
    @Override
    public KatalogBajuAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View bajuView = layoutInflater.inflate(R.layout.item_baju,parent, false);
        MyViewHolder viewHolder = new MyViewHolder(bajuView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KatalogBajuAdapter.MyViewHolder holder, int position) {
        KatalogBaju katalogBaju = bajuList.get(position);
        holder.nama.setText(katalogBaju.getNamaBaju());
        holder.warna.setText(katalogBaju.getWarnaBaju());
        holder.ukuran.setText(katalogBaju.getUkuranBaju());
        holder.image.setImageResource(katalogBaju.getBaju());
    }

    @Override
    public int getItemCount() {
        return (bajuList !=null ? bajuList.size() : 0);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama;
        public TextView warna;
        public TextView ukuran;
        public ImageView image;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            nama = itemView.findViewById(R.id.namaBj);
            warna = itemView.findViewById(R.id.warnaBj);
            ukuran = itemView.findViewById(R.id.ukuranBj);
            image = itemView.findViewById(R.id.imageBj);

        }
    }
}
