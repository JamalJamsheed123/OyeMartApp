package com.yesnet.oyemart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.yesnet.oyemart.features.onboarding.screens.MartLoginScreen
import com.yesnet.oyemart.features.onboarding.screens.ViewPagerAdapter
import com.yesnet.oyemart.model.PagesModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var iv1:ImageView
    private lateinit var iv2:ImageView
    private lateinit var iv3:ImageView


    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.view_pager2)
        iv1 = findViewById(R.id.iv1)
        iv2 = findViewById(R.id.iv2)
        iv3 = findViewById(R.id.iv3)


        val images = listOf(PagesModel("",R.drawable.group_2),PagesModel("Choose Favorite Product",R.drawable.undraw_choose),PagesModel("Get Fast Delivery",R.drawable.mask_group))
        val adapter = ViewPagerAdapter(images)
        viewPager2.adapter = adapter

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                changeColor()
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)

                changeColor()
            }

        })

        //Remove action bar
        removeActionBar()

        //goto next screen using button click
        val buttonClick = findViewById<Button>(R.id.button1)
        buttonClick.setOnClickListener{
            val intent = Intent(this, MartLoginScreen::class.java)
            startActivity(intent)
        }

    }

    private fun removeActionBar(){
        supportActionBar?.hide();
    }

    fun changeColor(){

        when(viewPager2.currentItem)
        {
            0->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.green))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white))

            }

            1->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.green))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.white))

            }

            2->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.white))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.green))

            }
        }
    }

}

//        //add the fragment here
//        val firstScreen = FirstScreen()
//        val fm: FragmentManager = supportFragmentManager
//        fm.beginTransaction().add(R.id.mainlayout,firstScreen).commit()
//add the fragment here
//val bt1 = view.findViewById<Button>(R.id.button1)
//bt1.setOnClickListener{
//    val secondScreen = SecondScreen()
//    val transaction: FragmentTransaction = fragmentManager?.beginTransaction()!!
//    transaction.replace(R.id.mainlayout,secondScreen)
//    transaction.commit()
//}
//
//val sk1 = view.findViewById<Button>(R.id.skip1)
//sk1.setOnClickListener{
//    val secondScreen = SecondScreen()
//    val transaction: FragmentTransaction = fragmentManager?.beginTransaction()!!
//    transaction.replace(R.id.mainlayout,secondScreen)
//    transaction.commit()
//}
