package com.example.utspraktikum

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(
    private val getActivity2: MainActivity,
    private val clubList: ArrayList<ClubBola>
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaClub : TextView = itemView.findViewById(R.id.tvNama)
        val asalClub : TextView = itemView.findViewById(R.id.tvAsal)
        val namaStd : TextView = itemView.findViewById(R.id.tvStadion)
        val gambar : ImageView = itemView.findViewById(R.id.gambarSatu)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int = clubList.size

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.namaClub.text = clubList[position].nama
        holder.asalClub.text = clubList[position].asal
        holder.namaStd.text = clubList[position].stadion
        holder.gambar.setImageResource(clubList[position].image)
        val pesan = "${clubList[position].nama} Berasal dari ${clubList[position].asal} Memiliki Stadion ${clubList[position].stadion}"

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, pesan, Toast.LENGTH_SHORT).show()}
    }
}