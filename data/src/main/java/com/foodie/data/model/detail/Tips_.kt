package com.foodie.data.model.detail

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Tips_ {

    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("groups")
    @Expose
    var groups: List<Group___>? = null
}
