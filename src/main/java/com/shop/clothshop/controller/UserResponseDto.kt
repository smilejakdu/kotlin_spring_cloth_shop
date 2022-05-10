package com.shop.clothshop.controller

import com.shop.clothshop.entity.User
import java.time.LocalDateTime

data class UserResponse(
    val userId:Long?,
    val userName:String,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?,
){
    companion object {
        fun of(user: User):UserResponse {
            return UserResponse(
                userId = user.id,
                userName = user.username,
                createdAt = user.createdAt,
                updatedAt = user.updatedAt,
            )
        }
    }
}