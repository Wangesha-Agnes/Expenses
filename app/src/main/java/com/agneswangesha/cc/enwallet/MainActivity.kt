package com.agneswangesha.cc.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agneswangesha.cc.enwallet.databinding.ActivityMainBinding
import com.agneswangesha.cc.enwallet.databinding.ExpenseListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager=LinearLayoutManager(this)
//         binding.rvElayoutManager = LinearLayoutManager(this)
        displayExpenses()

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


        val expensesList = listOf(expenses1, expenses2, expenses3, expenses4, expenses5, expenses6, expenses7, expenses8,expenses9)
        val expensesAdapter = ExpensesAdapter(expensesList)
        binding.rvExpenses.adapter=expensesAdapter

    }
}