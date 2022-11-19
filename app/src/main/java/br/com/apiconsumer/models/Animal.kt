package br.com.apiconsumer.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal (

     @SerializedName("name")
     var  name : String? = null,
     var  latin_name : String? = null,
     var animal_type : String? = null,
     var active_time : String? = null,
     var length_min : String? = null,
     var length_max : String? = null,
     var weight_min : String? = null,
     var weight_max : String? = null,
     var lifespan : String? = null,
     var habitat : String? = null,
     var diet : String? = null,
     var geo_range: String? = null,
     var image_link: String? = null,
     var id : Int? = null,

): Parcelable
