package com.kunalapk.smartrecyclerview.view

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.kunalapk.smartrecyclerview.adapter.CustomAdapter
import com.kunalapk.smartrecyclerview.listener.SmartRecyclerViewListener

class SmartRecyclerView<T> : SwipeRefreshLayout{

    private lateinit var recyclerView: RecyclerView
    
    private lateinit var customAdapter:CustomAdapter<T>

    private var isPaginated:Boolean = false

    private lateinit var smartRecyclerViewListener:SmartRecyclerViewListener<T>

    constructor(context: Context):super(context){

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        val constraintLayout = ConstraintLayout(context)
        recyclerView = RecyclerView(context)
        constraintLayout.addView(recyclerView)
        addView(constraintLayout)
    }


    fun initSmartRecyclerView(activity: AppCompatActivity,smartRecyclerViewListener: SmartRecyclerViewListener<T>,isPaginated:Boolean){
        this.smartRecyclerViewListener = smartRecyclerViewListener
        this.isPaginated = isPaginated
        this.setOnRefreshListener(onRefreshListener)
        attachAdapterToRecyclerView(activity,smartRecyclerViewListener)
    }


    private val onRefreshListener:OnRefreshListener = object :OnRefreshListener {
        override fun onRefresh() {
            smartRecyclerViewListener.onRefresh()
        }
    }


    fun addItems(itemList: MutableList<T>){
        customAdapter.addItems(itemList)
    }

    fun clearItem(){
        customAdapter.clearItem()
    }

    fun addItem(item:T){
        customAdapter.addItem(item)
    }

    fun addItem(position:Int,item:T){
        customAdapter.addItem(position,item)
    }

    fun getItems():MutableList<T>{
        return customAdapter.getItems()
    }

    private fun attachAdapterToRecyclerView(activity: AppCompatActivity,smartRecyclerViewListener:SmartRecyclerViewListener<T>){
        customAdapter = CustomAdapter<T>(activity = activity,isPaginated = isPaginated)
        customAdapter.smartRecyclerViewListener = smartRecyclerViewListener
        recyclerView.apply {
            adapter = customAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }
}