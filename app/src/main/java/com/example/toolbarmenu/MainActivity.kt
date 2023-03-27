package com.example.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.settings -> Toast.makeText(this,"Clicked on Settings !",Toast.LENGTH_SHORT).show()
            R.id.AddContact -> Toast.makeText(this,"Clicked on Settings !",Toast.LENGTH_SHORT).show()
            R.id.favorite -> Toast.makeText(this,"Clicked on Favorite !",Toast.LENGTH_SHORT).show()
            R.id.feedback -> Toast.makeText(this,"Clicked on Feedback !",Toast.LENGTH_SHORT).show()
            R.id.close -> finish()
        }
        return true
    }
}