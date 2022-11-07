package src.com.venturus.minimal.binder

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.venturus.minimal.binder.IMyService

class MyService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    class IMyServiceImpl : IMyService.Stub() {
        override fun showAToast() {

        }
    }
}