package com.example.workmanager

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            // Задаём условия запуска задачи
            val workRequest = OneTimeWorkRequest.Builder(MyWorker::class.java)
                .setInitialDelay(5, TimeUnit.SECONDS)
                .build()
            val workManager = WorkManager.getInstance()

            // Запускаем задачу
            workManager.enqueue(workRequest)
        }
    }

}