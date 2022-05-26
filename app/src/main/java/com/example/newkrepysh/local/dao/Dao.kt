package com.example.newkrepysh.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newkrepysh.entities.Childs
import com.example.newkrepysh.entities.Media
import com.example.newkrepysh.entities.User

@Dao
interface Dao {

    @Query("SELECT * FROM USER WHERE ID =:id")
    fun getUser(id: Int): User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertChild(childs: Childs)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMedia(childs: Media)

    @Query("SELECT * FROM Media where modelId=:id")
    fun getMedia(id:Int): List<Media>

    @Query("SELECT * FROM CHILDS")
    fun getChild(): List<Childs>




}