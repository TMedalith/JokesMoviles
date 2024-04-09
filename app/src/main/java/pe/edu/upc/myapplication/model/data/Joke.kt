package pe.edu.upc.myapplication.model.data

import com.google.gson.annotations.SerializedName

data class Joke(
    @SerializedName("joke")
    val text : String
)
