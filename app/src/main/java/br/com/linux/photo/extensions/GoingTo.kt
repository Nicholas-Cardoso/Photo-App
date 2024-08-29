package br.com.linux.photo.extensions

import android.content.Context
import android.content.Intent

fun Context.goingTo(clazz: Class<*>, intent: Intent.() -> Unit = {}) {
    Intent(this, clazz)
        .apply {
            intent()
            startActivity(this)
        }
}