package com.example.scannmark

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.BarcodeCallback
import com.journeyapps.barcodescanner.BarcodeResult
import com.journeyapps.barcodescanner.CaptureManager
import com.journeyapps.barcodescanner.DecoratedBarcodeView


@SuppressLint("ParcelCreator")
class ImageActivity() : AppCompatActivity(), Parcelable {
    private lateinit var barcodeView: DecoratedBarcodeView
    private lateinit var captureManager: CaptureManager
    var mAuth: FirebaseAuth? = null
    var studentDbRef: DatabaseReference? = null

    constructor(parcel: Parcel) : this() {

    }

    companion object {
        private const val CAMERA_PERMISSION_REQUEST = 123
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        barcodeView = findViewById(R.id.barcodeView)

        captureManager = CaptureManager(this, barcodeView)
        captureManager.initializeFromIntent(intent, savedInstanceState)
        captureManager.decode()

        barcodeView.decodeContinuous(object : BarcodeCallback {
            override fun barcodeResult(result: BarcodeResult) {
                val qrCodeData = result.text

                Log.d("QR Code Result", qrCodeData)


                val user = FirebaseAuth.getInstance().currentUser

                val email = user!!.email
                val username = email!!.split("@".toRegex()).dropLastWhile { it.isEmpty() }
                    .toTypedArray()
                val name = username[0]

                val session: String = "test//123"
                val sessioninfo = session.split("//".toRegex()).dropLastWhile { it.isEmpty() }
                    .toTypedArray()


                //session-info[0]=coursename [2]=session or current class details

                //session-info[0]=coursename [2]=session or current class details
                studentDbRef = FirebaseDatabase.getInstance().reference.child(sessioninfo[0])
                    .child(sessioninfo[1])




                //writing record to firbase

                //writing record to firbase
                val load = load(name)
                studentDbRef!!.child(username[0]).setValue(load)



                Toast.makeText(this@ImageActivity,"Attendance Marked", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this@ImageActivity, homepage::class.java))
            }

            override fun possibleResultPoints(resultPoints: List<ResultPoint>) {
                // Optional callback for location of the scanned barcode on the screen
            }
        })
    }

    override fun onResume() {
        super.onResume()
        requestCameraPermission()
        captureManager.onResume()
    }

    override fun onPause() {
        super.onPause()
        captureManager.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        captureManager.onDestroy()
    }

    private fun requestCameraPermission() {
        val permission = Manifest.permission.CAMERA
        val granted = PackageManager.PERMISSION_GRANTED
        if (ContextCompat.checkSelfPermission(this, permission) != granted) {
            ActivityCompat.requestPermissions(this, arrayOf(permission), CAMERA_PERMISSION_REQUEST)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CAMERA_PERMISSION_REQUEST) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                captureManager.onResume()
            } else {
                startActivity(Intent(this@ImageActivity, homepage::class.java))
                Toast.makeText(this@ImageActivity, "Camera permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }


}
