package src.com.venturus.minimal.binder

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.Toast

import com.venturus.minimal.binder.IMyService

class MyService : Service() {
    override fun onBind(intent: Intent?) = mMyService

    private val handler = Handler(Looper.getMainLooper())

    private val mMyService = object : IMyService.Stub() {
        override fun showAToast() {
            handler.post {
                Toast.makeText(this@MyService, "Hello there", Toast.LENGTH_SHORT).show()
            }
        }
    }
}