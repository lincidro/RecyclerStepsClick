package com.eduardo.recyclerpractice1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eduardo.recyclerpractice1.Interfaces.RecyclerViewClickListener;
import com.eduardo.recyclerpractice1.Model.Car;
import com.eduardo.recyclerpractice1.R;

import java.util.List;

public class CarAdapterRecycler extends RecyclerView.Adapter<CarAdapterRecycler.MyViewHolder>{

    private RecyclerViewClickListener clickListener_1;
    private List<Car> carList;

    public CarAdapterRecycler(List<Car> carList, RecyclerViewClickListener clickListener_1){
        this.carList = carList;
        this.clickListener_1 = clickListener_1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        return new MyViewHolder(view, clickListener_1);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.etBrand.setText(car.getBrand());
        holder.etCc.setText(String.valueOf(car.getCc()));
        holder.etDoors.setText(String.valueOf(car.getDoors()));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private RecyclerViewClickListener clickListener_0;
        public TextView etBrand, etCc, etDoors;
        public MyViewHolder(@NonNull View itemView, RecyclerViewClickListener clickListener_0) {
            super(itemView);
            etBrand = itemView.findViewById(R.id.tv_brand);
            etCc = itemView.findViewById(R.id.tv_cc);
            etDoors = itemView.findViewById(R.id.tv_doors);
            //Click
            this.clickListener_0 = clickListener_0;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener_0.onClick(view, getAdapterPosition());
        }
    }
}
