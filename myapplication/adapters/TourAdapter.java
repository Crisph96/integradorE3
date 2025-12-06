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
import com.abraham.myapplication.models.Tour;

import java.util.List;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.ViewHolder> {

    Context context;
    List<Tour> list;

    public TourAdapter(Context context, List<Tour> list) {
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
        Tour t = list.get(position);

        holder.txtTitulo.setText(t.getNombre());
        holder.txtSubtitulo.setText(t.getCiudad());
        holder.txtPrecio.setText("$" + t.getPrecio());

        holder.itemView.setOnClickListener(v ->
                Toast.makeText(context, "Reservaste el tour: " + t.getNombre(), Toast.LENGTH_SHORT).show()
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

