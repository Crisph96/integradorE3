package com.abraham.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abraham.myapplication.R;
import com.abraham.myapplication.models.Vehicle;

import java.util.List;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.ViewHolder> {

    Context context;
    List<Vehicle> list;

    public VehicleAdapter(Context context, List<Vehicle> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_service, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Vehicle v = list.get(position);

        holder.txtTitulo.setText(v.getMarca() + " " + v.getModelo());
        holder.txtSubtitulo.setText("Renta por día");
        holder.txtPrecio.setText("$" + v.getPrecioDia());

        holder.itemView.setOnClickListener(item ->
                Toast.makeText(context, "Rentaste: " + v.getMarca() + " " + v.getModelo(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() { return list.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtSubtitulo, txtPrecio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtSubtitulo = itemView.findViewById(R.id.txtSubtitulo);
            txtPrecio = itemView.findViewById(R.id.txtPrecio);
        }
    }
}
