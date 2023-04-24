package com.example.appworkmanager

import android.content.Context
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class AlarmNotify(private val context: Context) {
    fun setOneTimeWorkRequest(){
        val workManager = WorkManager.getInstance(context)
        val uploadRequest = OneTimeWorkRequest.Builder(UploadWorker::class.java)
            .addTag("time")
            .setInitialDelay(5, TimeUnit.SECONDS)
            .build()

        workManager.enqueue(uploadRequest)
    }
}