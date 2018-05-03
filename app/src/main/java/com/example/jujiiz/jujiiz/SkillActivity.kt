package com.example.jujiiz.jujiiz

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        clearProgress()
    }

    override fun onStart() {
        super.onStart()

        increaseProgress()
    }

    override fun onResume() {
        super.onResume()

        clearProgress()
        increaseProgress()
    }

    private fun clearProgress(){
        var startProgress = 0

        pbJava.progress = startProgress
        pbCS.progress = startProgress
        pbKotlin.progress = startProgress
        pbSQL.progress = startProgress
        pbHTML.progress = startProgress
        pbPHP.progress = startProgress
        pbMobileDev.progress = startProgress
        pbWebDev.progress = startProgress
        pbXamarinDev.progress = startProgress
        pbWindowsDev.progress = startProgress
        pbVegas.progress = startProgress
        pbPhotoshop.progress = startProgress
    }

    private fun increaseProgress(){
        Thread(Runnable {
            try {
                var i=0
                while(i<100){
                    Thread.sleep(10)
                    if (i <= 90) {
                        pbJava.progress ++
                    }
                    if (i <= 80) {
                        pbCS.progress ++
                    }
                    if (i <= 85) {
                        pbKotlin.progress ++
                    }
                    if (i <= 70) {
                        pbSQL.progress ++
                    }
                    if (i <= 60) {
                        pbHTML.progress ++
                    }
                    if (i <= 55) {
                        pbPHP.progress ++
                    }
                    if (i <= 90) {
                        pbMobileDev.progress ++
                    }
                    if (i <= 60) {
                        pbWebDev.progress ++
                    }
                    if (i <= 65) {
                        pbXamarinDev.progress ++
                    }
                    if (i <= 75) {
                        pbWindowsDev.progress ++
                    }
                    if (i <= 65) {
                        pbVegas.progress ++
                    }
                    if (i <= 67) {
                        pbPhotoshop.progress ++
                    }
                    i++
                }
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

        }).start()
    }
}
