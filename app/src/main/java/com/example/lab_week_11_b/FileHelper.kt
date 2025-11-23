package com.example.lab_week_11_b

import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.core.content.FileProvider
import java.io.File

class FileHelper(private val context: Context) {

    fun getUriFromFile(file: File): Uri {
        // authority harus sama seperti di AndroidManifest provider
        return FileProvider.getUriForFile(
            context,
            "com.example.lab_week_11_b.camera",
            file
        )
    }

    // folder names used for getExternalFilesDir(...)
    fun getPicturesFolder(): String = Environment.DIRECTORY_PICTURES
    fun getVideosFolder(): String = Environment.DIRECTORY_MOVIES
}
