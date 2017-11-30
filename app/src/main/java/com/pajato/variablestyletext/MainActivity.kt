package com.pajato.variablestyletext

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun updateString(v: View) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            // This method is deprecated after android N.
            @Suppress("DEPRECATION")
            textHere.text = Html.fromHtml(editText.text.toString())
        } else {
            // This method was introduced in Android N.
            textHere.text = Html.fromHtml(editText.text.toString(), Html.FROM_HTML_MODE_LEGACY)
        }
    }
}
