package com.tugastengahsemester.akbardinullah

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.layer2.*


class Activity2 : AppCompatActivity() {
    val list = ArrayList<List>()

    val listUsers = arrayOf(
        "Gili Kondo"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layer2)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        for (i in 0 until listUsers.size){

            list.add(List(listUsers.get(i)))

            if(listUsers.size - 1 == i){
                // init adapter yang telah dibuat tadi
                val adapter = ListAdapter(list)
                adapter.notifyDataSetChanged()

                //tampilkan data dalam recycler view
                recyclerView.adapter = adapter
            }
        }
    }
}