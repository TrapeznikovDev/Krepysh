package com.example.newkrepysh.ui.dashboard

interface PerformClickFromAdapter {
    fun navigate(pos: Int)
}

interface PerformClickFromAdapterForKid {
    fun navigate(pos: Int, userId: Int)
}