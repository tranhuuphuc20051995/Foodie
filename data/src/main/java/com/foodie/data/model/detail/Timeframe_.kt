package com.foodie.data.model.detail

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Timeframe_ {

    @SerializedName("days")
    @Expose
    var days: String? = null
    @SerializedName("open")
    @Expose
    var open: List<Open_>? = null
    @SerializedName("segments")
    @Expose
    var segments: List<Any>? = null
}
