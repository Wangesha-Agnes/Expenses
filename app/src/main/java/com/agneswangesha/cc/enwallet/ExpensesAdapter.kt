package com.agneswangesha.cc.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ExpensesAdapter (Val expenseList: List<Expenses>):RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.expense_list_item, parent, false)
        return ExpensesViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return expensesList.size
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val Expenses = expenseList[position]
        holder.tvMoney.text = expense.money
        holder.tvSalary.text = expense.salary
        holder.tvDate.text = expense.Date
    }
}
class ExpensesViewHolder(itemView: ItemView: View): RecyclerView.ViewHolder(itemView){
    val tvMoney = itemView.findViewById<TextView>(R.id.tvMoney)
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}