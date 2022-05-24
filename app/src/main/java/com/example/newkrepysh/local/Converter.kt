package com.example.newkrepysh.local

import androidx.room.TypeConverter
import com.example.newkrepysh.entities.*
import com.example.newkrepysh.entities.abonements.AbonementsData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {

    @TypeConverter
    fun fromString(value: String?): ArrayList<String>{
        val listType = object: TypeToken<ArrayList<String>>(){}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArray(list: ArrayList<String>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromUser(value: String) = Gson().fromJson(value, Array<User>::class.java).toList()

    @TypeConverter
    fun fromParent(value: String) = Gson().fromJson(value, Array<Parent>::class.java).toList()

    @TypeConverter
    fun fromChilds(value: String) = Gson().fromJson(value, Array<Childs>::class.java).toList()

    @TypeConverter
    fun toUser(list: List<User>?): String{
        return Gson().toJson(list)
    }
    @TypeConverter
    fun toParent(list: List<Parent>?): String{
        return Gson().toJson(list)
    }
    @TypeConverter
    fun toChilds(list: List<Childs>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromSchools(value: String) = Gson().fromJson(value, Array<Schools>::class.java).toList()

    @TypeConverter
    fun toSchools(list: List<Schools>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromAreas(value: String) = Gson().fromJson(value, Array<Areas>::class.java).toList()

    @TypeConverter
    fun toAreas(list: List<Areas>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromGeneratedConversions(value: String) = Gson().fromJson(value, Array<GeneratedConversions>::class.java).toList()

    @TypeConverter
    fun toGeneratedConversions(list: List<GeneratedConversions>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toAbonements(list: List<AbonementsData>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromAbonements(value: String) = Gson().fromJson(value, Array<AbonementsData>::class.java).toList()

    @TypeConverter
    fun toMedia(list: List<Media>?): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromMedia(value: String) = Gson().fromJson(value, Array<Media>::class.java).toList()

}