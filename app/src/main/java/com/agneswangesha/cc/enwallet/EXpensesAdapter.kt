package com.agneswangesha.cc.enwallet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EXpensesAdapter (Val expenseList: List<Expenses>):RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.expense_layout, parent, false)
        return ExpensesViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return expensesList.size
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val Expenses = expenseList[position]
        holder.tvMoney.text = expense.
    }
}
