package com.tuonbondol.networkutil

import android.content.Context
import android.net.ConnectivityManager

/***
 *
 * @author TUON BONDOL
 *
 */

fun isNetworkConnected(context: Context): Boolean {
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val netInfo = connectivityManager.activeNetworkInfo
    return netInfo != null && netInfo.isConnected
}
 
