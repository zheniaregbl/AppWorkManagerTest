package com.example.appworkmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(private val context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        try{
            for (i in 0..600){
                Log.d("tag123", "Uploading $i")
            }
        } catch (e: Exception){
            return Result.failure()
        }
        val alarmNotify = AlarmNotify(context)
        alarmNotify.setOneTimeWorkRequest()

        return Result.success()
    }
}