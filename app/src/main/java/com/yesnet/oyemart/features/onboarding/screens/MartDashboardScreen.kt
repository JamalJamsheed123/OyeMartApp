package com.yesnet.oyemart.features.onboarding.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yesnet.oyemart.Dashboard.*
import com.yesnet.oyemart.R

class MartDashboardScreen : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mart_dashboard_screen)
        loadFragment(HomeFragment())
        bottomNav = findViewById(R.id.navi) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.search -> {
                    loadFragment(SearchFragment())
                    true
                }
                R.id.priority -> {
                    loadFragment(PriorityFragment())
                    true
                }

                R.id.cart -> {
                    loadFragment(AddCartFragment())
                    true
                }

                R.id.profile -> {
                    loadFragment(ProfileFragment())
                    true
                }
                else -> throw AssertionError()
            }
        }
    }

    private  fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

}