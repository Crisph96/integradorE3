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
import com.abraham.myapplication.models.Transport;

import java.util.List;

public class TransportAdapter extends RecyclerView.Adapter<TransportAdapter.ViewHolder> {

    Context context;
    List<Transport> list;

    public TransportAdapter(Context context, List<Transport> list) {
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
        Transport t = list.get(position);

        holder.txtTitulo.setText(t.getOrigen() + " → " + t.getDestino());
        holder.txtSubtitulo.setText("Servicio de transporte");
        holder.txtPrecio.setText("$" + t.getPrecio());

        holder.itemView.setOnClickListener(v ->
                Toast.makeText(context, "Reservaste transporte de " + t.getOrigen() + " a " + t.getDestino(), Toast.LENGTH_SHORT).show()
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

