package com.shop.clothshop.service

import com.shop.clothshop.controller.UserResponse
import com.shop.clothshop.repository.UserRepository
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import org.springframework.data.domain.Pageable

@Service
class UserService(
    private val userRepository: UserRepository
){
    fun findAll(pageable: Pageable) = userRepository.findAll()
}