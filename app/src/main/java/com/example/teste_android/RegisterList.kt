package com.example.teste_android

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_register_list.*

class RegisterList : AppCompatActivity() {

    private lateinit var mToolbar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_list)

        mToolbar = findViewById(R.id.menu_Toolbar)
        setSupportActionBar(mToolbar)

        loadRegisters()

        registerList_RecyclerView.layoutManager = LinearLayoutManager(this)
        registerList_RecyclerView.adapter = RegisterAdapter()
    }

    private fun loadRegisters() {
        val ref = true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu_account, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.action_menu_icon_add -> {
                startActivity(Intent(this, RegisterNew::class.java))
            }
        }
        return true
    }
}