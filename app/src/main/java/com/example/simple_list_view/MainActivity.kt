package com.example.simple_list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listviewyangu=findViewById<ListView>(R.id.mylistview)
        val nchi= arrayOf("Kenya","Uganda","Ethopia","Burudi","Somali")
        val arrayAdapter:ArrayAdapter<String> =ArrayAdapter(this,android.R.layout.simple_list_item_1,nchi)
        listviewyangu.adapter=arrayAdapter



        listviewyangu.setOnItemClickListener{ adapterView, view, position, l ->
            Toast.makeText(this,"You have clicked on "+ nchi[position],Toast.LENGTH_LONG).show()
        }
    }
}