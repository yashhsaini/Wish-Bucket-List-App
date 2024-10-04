package com.example.mywishlistapp

 sealed  class Screen(val route:String) {
     object HomeScreen:Screen("home-screen")
     object AddScreen:Screen("Add-screen")
}