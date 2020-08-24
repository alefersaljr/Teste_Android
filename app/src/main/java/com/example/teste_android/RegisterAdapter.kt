package com.example.teste_android

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RegisterAdapter: RecyclerView.Adapter<RegisterViewHolder>() {


    override fun getItemCount(): Int {
        return 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegisterViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RegisterViewHolder, position: Int) {

    }

}

class RegisterViewHolder (v: View): RecyclerView.ViewHolder(v)  {

}