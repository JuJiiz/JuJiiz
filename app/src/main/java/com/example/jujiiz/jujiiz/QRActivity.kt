package com.example.jujiiz.jujiiz

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult
import kotlinx.android.synthetic.main.activity_qr.*

class QRActivity : AppCompatActivity() {
    var act: Activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr)
    }

    override fun onResume() {
        super.onResume()
        btnScan.setOnClickListener {
            var integrator = IntentIntegrator(act)
            integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
            integrator.setPrompt("Scan");
            integrator.setCameraId(0);
            integrator.setBeepEnabled(false);
            integrator.setBarcodeImageEnabled(false);
            integrator.initiateScan();
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        var result: IntentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents == null) {
                //Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_SHORT).show();
            } else {
                var strScan = result.contents
                if (strScan.equals("JuJiizIsHappy")) {
                    var intent = Intent(this, MainTabActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong password.", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(this, result.contents,Toast.LENGTH_SHORT).show();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
