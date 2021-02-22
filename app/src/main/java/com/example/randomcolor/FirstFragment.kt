package com.example.randomcolor

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var view1 = requireActivity().findViewById<View>(R.id.view1)
        var view2 = requireActivity().findViewById<View>(R.id.view2)
        var view3 = requireActivity().findViewById<View>(R.id.view3)
        var view4 = requireActivity().findViewById<View>(R.id.view4)
        var view5 = requireActivity().findViewById<View>(R.id.view5)
        var view6 = requireActivity().findViewById<View>(R.id.view6)
        var view7 = requireActivity().findViewById<View>(R.id.view7)
        var view8 = requireActivity().findViewById<View>(R.id.view8)
        var view9 = requireActivity().findViewById<View>(R.id.view9)
        var view10 = requireActivity().findViewById<View>(R.id.view10)
        var view11 = requireActivity().findViewById<View>(R.id.view11)
        var view12 = requireActivity().findViewById<View>(R.id.view12)
        var view13 = requireActivity().findViewById<View>(R.id.view13)
        var view14 = requireActivity().findViewById<View>(R.id.view14)
        var view15 = requireActivity().findViewById<View>(R.id.view15)
        var view16 = requireActivity().findViewById<View>(R.id.view16)
        var view17 = requireActivity().findViewById<View>(R.id.view17)
        var view18 = requireActivity().findViewById<View>(R.id.view18)
        var view19 = requireActivity().findViewById<View>(R.id.view19)
        var view20 = requireActivity().findViewById<View>(R.id.view20)
        var view21 = requireActivity().findViewById<View>(R.id.view21)
        var listOfColors = listOf("#FFFFFF","#C0C0C0","#808080","#000000","#FF0000","#800000",
            "#FFFF00","#808000","#00FF00","#008000","#0000FF","#008080","#000080","#FF00FF","#800080",
            "#9FE2BF","#40E0D0","#6495ED","#CCCCFF","#DFFF00","#0CB193","#B10C2C")
        view1.setOnClickListener {
            view1.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view2.setOnClickListener {
            view2.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view3.setOnClickListener {
            view3.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view4.setOnClickListener{
            view4.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view5.setOnClickListener{
            view5.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view6.setOnClickListener{
            view6.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view7.setOnClickListener{
            view7.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view8.setOnClickListener{
            view8.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view9.setOnClickListener{
            view9.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view10.setOnClickListener {
            view10.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view11.setOnClickListener {
            view11.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view12.setOnClickListener {
            view12.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view13.setOnClickListener{
            view13.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view14.setOnClickListener{
            view14.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view15.setOnClickListener{
            view15.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view16.setOnClickListener{
            view16.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view17.setOnClickListener{
            view17.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view18.setOnClickListener{
            view18.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view19.setOnClickListener{
            view19.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view20.setOnClickListener{
            view20.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view21.setOnClickListener{
            view21.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }

    }
}