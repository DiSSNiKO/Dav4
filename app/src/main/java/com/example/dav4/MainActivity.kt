package com.example.dav4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var niuRecView : RecyclerView
    private lateinit var leBroList : ArrayList<recyModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        niuRecView = findViewById(R.id.recviu)
        leBroList = arrayListOf<recyModel>()
        niuRecView.layoutManager = LinearLayoutManager(this)
        getData()
    }
    val neims : ArrayList<String> = arrayListOf(
        "John", "Dogg", "Ching Mao", "Max Verstappen",
        "Dachi", "Slozo", "Miranda"
    )
    val brocupations : ArrayList<String> = arrayListOf(
        "dunce", "it support", "program developer", "developer programmer",
        "janitor", "doktor", "attorney"
    )
    private fun getData() {
        for (i in neims.indices) {
            leBroList.add(recyModel(neims[i],brocupations[i]))
        }
        niuRecView.adapter = adapterCls(leBroList)
    }
}