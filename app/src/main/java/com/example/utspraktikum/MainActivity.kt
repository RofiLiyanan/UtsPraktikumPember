package com.example.utspraktikum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView : RecyclerView? =null
    private var mainAdapter : MainAdapter? = null
    private var clubBola = mutableListOf<ClubBola>()

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clubBola = ArrayList()

        prepareclubData()

        list()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val navInflater = menuInflater
        menuInflater.inflate(R.menu.navigasi,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.grid->{
                grid()
                return true
            }
            R.id.list->{
                list()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun list() {
        recyclerView = findViewById<View>(R.id.rvClubBola) as RecyclerView
        mainAdapter = MainAdapter(this, clubBola as ArrayList<ClubBola>)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = mainAdapter
    }

    private fun grid() {
        recyclerView = findViewById<View>(R.id.rvClubBola) as RecyclerView
        mainAdapter = MainAdapter(this, clubBola as ArrayList<ClubBola>)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = mainAdapter

    }

    private fun prepareclubData() {
        var club = ClubBola("Persib","Indonesia","Sijalak Harupat",R.drawable.persib)
        clubBola.add(club)
        club = ClubBola("Psm","Indonesia","Mattoangin",R.drawable.psm)
        clubBola.add(club)
        club = ClubBola("Persebaya","Indonesia","GBT",R.drawable.persebaya)
        clubBola.add(club)
        club = ClubBola("Bali United","Indonesia","I wayan Dipta",R.drawable.bali)
        clubBola.add(club)
        club = ClubBola("Barcelona","Spanyol","Camp Nou",R.drawable.barca)
        clubBola.add(club)
        club = ClubBola("Real Madrid","Spanyol","Santiago Ber",R.drawable.real)
        clubBola.add(club)
        club = ClubBola("Man United","Inggris","Old Trafford",R.drawable.mu)
        clubBola.add(club)
        club = ClubBola("Liverpool","Inggris","Anfield",R.drawable.ipul)
        clubBola.add(club)
        club = ClubBola("Bayern Munchen","Jerman","Allianz Arena",R.drawable.bayern)
        clubBola.add(club)
        club = ClubBola("Dortmund","Jerman","Signal Iduna Park",R.drawable.dortmund)
        clubBola.add(club)
        club = ClubBola("PSG","Perancis","Park Des Prince",R.drawable.psg)
        clubBola.add(club)
        club = ClubBola("Marseille","Perancis","Velodrome",R.drawable.marseille)
        clubBola.add(club)
        club = ClubBola("Arsenal","Inggris","Emirates",R.drawable.arsenal)
        clubBola.add(club)
        club = ClubBola("Manchester city","Inggris","Etihad Stadium",R.drawable.mc)
        clubBola.add(club)
        club = ClubBola("Atletico Madrid","Spanyol","Wanda Metropolitano",R.drawable.atletico)
        clubBola.add(club)
        club = ClubBola("Benfica","Portugal","Stadion Da Luz",R.drawable.benficaa)
        clubBola.add(club)
        club = ClubBola("Inter Milan","Italia","Gieseppe Meazza",R.drawable.inter)
        clubBola.add(club)
        club = ClubBola("Juventus","Italia","Allianz STD",R.drawable.juve)
        clubBola.add(club)
        club = ClubBola("Sporting Lisbon","Italia","Jose Alvalede",R.drawable.lisbon)
        clubBola.add(club)
        club = ClubBola("As Roma","Italia","Olimpiade STD",R.drawable.roma)
        clubBola.add(club)
    }
}