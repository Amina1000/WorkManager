package com.example.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * homework com.example.workmanager
 *
 * @author Amina
 * 01.08.2021
 */
const val WORK_MANAGER = "WorkManager"

class MyWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        Log.d(WORK_MANAGER, "doWork: start")
        try {
            Thread.sleep(10000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Log.d(WORK_MANAGER, "doWork: finish")
        return Result.success()
    }
}