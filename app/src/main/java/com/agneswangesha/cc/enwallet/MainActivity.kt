package com.agneswangesha.cc.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agneswangesha.cc.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager = LinearLayoutManager(this)
        display

    }
    fun displayExpenses(){
        val expenses1 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses2 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses3 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses4 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses5 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses6 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses7 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses8 = Expenses("", "Salary", "1st July","KES 42000")
        val expenses9 = Expenses("", "Salary", "1st July","KES 42000")
    }
}