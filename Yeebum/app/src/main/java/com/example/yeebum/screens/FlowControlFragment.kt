package com.example.yeebum.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yeebum.R
import com.example.yeebum.screens.adapters.recycler_views.FlowsRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_flow_control.*


class FlowControlFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
        = inflater.inflate(R.layout.fragment_flow_control, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        flowsRecyclerView.layoutManager = LinearLayoutManager(context)
        flowsRecyclerView.adapter = FlowsRecyclerViewAdapter()
        Log.d("TAG","Ustawiono")
    }

    override fun onResume() {
        super.onResume()

    }




}