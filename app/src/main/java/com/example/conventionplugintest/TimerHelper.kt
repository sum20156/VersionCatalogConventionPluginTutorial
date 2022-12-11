package com.example.conventionplugintest

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*

object TimerHelper {

    @RequiresApi(Build.VERSION_CODES.N)
    fun getEndTimeStringFromLong(pTime: Long): String? {
        val lToday = Calendar.getInstance()
        lToday.timeInMillis = Date().time
        val lGivenTime = Calendar.getInstance()
        lGivenTime.timeInMillis = pTime
        val lDateFormat = SimpleDateFormat("MMM d, YYYY")
        val lTodayDate = lDateFormat.format(Date(lToday.timeInMillis))
        val lGiveDate = lDateFormat.format(Date(lGivenTime.timeInMillis))
        return if (lTodayDate == lGiveDate) {
            SimpleDateFormat("h:mm a").format(Date(pTime)).replace("am", "AM").replace("pm", "PM")
        } else {
            lDateFormat.format(Date(pTime))
        }
    }


}