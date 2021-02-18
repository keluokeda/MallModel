package com.ke.mall.model.shared.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(
    val id: Long,
    val token: String
) : Parcelable
