package com.yesnet.oyemart.Dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yesnet.oyemart.R
import com.yesnet.oyemart.features.onboarding.screens.ChildMyAdapter1
import com.yesnet.oyemart.features.onboarding.screens.ChildMyAdapter2
import com.yesnet.oyemart.features.onboarding.screens.ChildMyAdapter3
import com.yesnet.oyemart.features.onboarding.screens.ParentMyAdapter
import com.yesnet.oyemart.model.ChildModel1
import com.yesnet.oyemart.model.ChildModel2
import com.yesnet.oyemart.model.ChildModel3
import com.yesnet.oyemart.model.ParentProducts

class HomeFragment : Fragment() {

    private lateinit var adapter: ParentMyAdapter
    private lateinit var adapter1: ChildMyAdapter1
    private lateinit var adapter2: ChildMyAdapter2
    private lateinit var adapter3: ChildMyAdapter3

    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var recyclerView3: RecyclerView
    private lateinit var recyclerView4: RecyclerView

    private lateinit var productArrayList: ArrayList<ParentProducts>
    private lateinit var productArrayList1: ArrayList<ChildModel1>
    private lateinit var productArrayList2: ArrayList<ChildModel2>
    private lateinit var productArrayList3: ArrayList<ChildModel3>

    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var childimage1 : Array<Int>
    lateinit var childimage2 : Array<Int>
    lateinit var category: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //For Parent Products
        dataInitialize()
        val LayoutManager = LinearLayoutManager(context)
        recyclerView1 = view.findViewById(R.id.parent_recycler_view)
        recyclerView1.layoutManager = LayoutManager
        recyclerView1.setHasFixedSize(true)
        adapter = ParentMyAdapter(productArrayList)
        recyclerView1.adapter = adapter


        //For Child Products
        dataInitialize1()
        val LayoutManager1 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView2 = view.findViewById(R.id.child_recycler_view1)
        recyclerView2.layoutManager = LayoutManager1
        recyclerView2.setHasFixedSize(true)
        adapter1 = ChildMyAdapter1(productArrayList1)
        recyclerView2.adapter = adapter1

        //For Child 2 Products
        dataInitialize2()
        val LayoutManager2 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView3 = view.findViewById(R.id.child_recycler_view2)
        recyclerView3.layoutManager = LayoutManager2
        recyclerView3.setHasFixedSize(true)
        adapter2 = ChildMyAdapter2(productArrayList2)
        recyclerView3.adapter = adapter2

        //For Child 3 Products
        dataInitialize3()
        val LayoutManager3 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        recyclerView4 = view.findViewById(R.id.child_recycler_view3)
        recyclerView4.layoutManager = LayoutManager3
        recyclerView4.setHasFixedSize(true)
        adapter3 = ChildMyAdapter3(productArrayList3)
        recyclerView4.adapter = adapter3



    }

    private fun dataInitialize(){
        productArrayList = arrayListOf()

        imageId = arrayOf(
            R.drawable.oil1,
            R.drawable.oil2,
            R.drawable.oil3,
            R.drawable.oil4,
            R.drawable.oil5
        )

        heading = arrayOf(

            getString(R.string.heading_1),
            getString(R.string.heading_2),
            getString(R.string.heading_3),
            getString(R.string.heading_4),
            getString(R.string.heading_5)
        )

        for (i in imageId.indices){

            val products = ParentProducts(imageId[i], heading[i])
            productArrayList.add(products)
        }
    }

    private fun dataInitialize1(){

        productArrayList1 = arrayListOf()

        childimage1 = arrayOf(
            R.drawable.groceries_thinkstockphotos_836782690_1,
            R.drawable.groceries2
        )


        for (i in childimage1.indices){

            val products1 = ChildModel1(childimage1[i])
            productArrayList1.add(products1)
        }
    }

    private fun dataInitialize2(){

        productArrayList2 = arrayListOf()

        childimage2 = arrayOf(
            R.drawable.lux,
            R.drawable.ghee,
            R.drawable.oils,
            R.drawable.tea,
            R.drawable.salt_1,
            R.drawable.colgate_plax_fresh,
            R.drawable.coffee
        )


        for (i in childimage2.indices){

            val products2 = ChildModel2(childimage2[i])
            productArrayList2.add(products2)
        }
    }

    private fun dataInitialize3(){

        productArrayList3 = arrayListOf()

        category = arrayOf(
            getString(R.string.product_catogory1),
            getString(R.string.product_catogory2),
            getString(R.string.product_catogory3),
            getString(R.string.product_catogory4),
            getString(R.string.product_catogory5),
            getString(R.string.product_catogory6),
            getString(R.string.product_catogory7)
        )


        for (i in category.indices){

            val products3 = ChildModel3(category[i])
            productArrayList3.add(products3)
        }
    }

}