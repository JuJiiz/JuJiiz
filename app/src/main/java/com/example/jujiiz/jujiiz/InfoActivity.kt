package com.example.jujiiz.jujiiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        ivPersonal.setImageResource(R.drawable.studentphoto)

        tvFName.text = "นายมณฑวัฒน์"
        tvLName.text = "ยางเดี่ยว"
        tvAddress.text = "184 หมู่ที่ 9"
        tvSubDist.text = "นาสะไมย์"
        tvDist.text = "เมืองยโสธร"
        tvProvince.text = "ยโสธร"
        tvZip.text = "35000"
        tvBirth.text = "2 กุมภาพันธ์ พ.ศ.2539"
        tvTel.text = "088-0874715"
        tvEmail.text = "ju.jiiz.1579@gmail.com"
        tvAbilityMusic.text = "กีต้าร์, กีต้าร์เบส"
        tvAbilitySport.text = "ซอฟท์บอล, เบสบอล, บาสเกตบอล, แบดมินตัน, ฟุตบอล, จรวดขวดน้ำ"

        tvBachelor.text = "วิทยาการคอมพิวเตอร์"
        tvDepartment.text = "วิทยาการคอมพิวเตอร์"
        tvFaculty.text = "วิทยาศาสตร์"
        tvUniversity.text = "มหาวิทยาลัยขอนแก่น"
        tvGPA.text = "2.16"
    }
}
