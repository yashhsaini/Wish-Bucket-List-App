package com.example.mywishlistapp

import android.app.Application
//Initialising our database because it need to be called from global context
class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}