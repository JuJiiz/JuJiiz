package com.example.jujiiz.jujiiz

import android.app.LocalActivityManager
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost

class MainTabActivity : AppCompatActivity() {

    lateinit var mLocalActivityManager: LocalActivityManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tab)

        mLocalActivityManager = LocalActivityManager(this, false)
        mLocalActivityManager.dispatchCreate(savedInstanceState)

        val tabHost = findViewById(R.id.tabhost) as TabHost
        tabHost.setup(mLocalActivityManager)

        val tabSpec = tabHost.newTabSpec("tab1")
                .setIndicator("ข้อมูลส่วนตัว")
                .setContent(Intent(this, InfoActivity::class.java))

        val tabSpec2 = tabHost.newTabSpec("tab2")
                .setIndicator("ความสามารถ")
                .setContent(Intent(this, SkillActivity::class.java))

        tabHost.addTab(tabSpec)
        tabHost.addTab(tabSpec2)
    }
}
