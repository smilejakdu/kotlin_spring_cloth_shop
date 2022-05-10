package com.shop.clothshop.repository

import com.shop.clothshop.entity.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserCrudRepository<T : User> : CrudRepository<T, Long> {

    fun findAll(pageable: Pageable): Page<T>

    fun findAllByEnabledTrue(pageable: Pageable): Page<T>

    fun findByUsername(username: String): Optional<T>

    fun findByNameContaining(name: String, pageable: Pageable): Page<T>

    fun findByIdContaining(id: String, pageable: Pageable): Page<T>

    fun findAllByIdInAndEnabledTrue(ids: Set<String>): Iterable<T>

    fun existsByUsername(username: String): Boolean

    fun findByName(name: String): Optional<T>

}

interface UserRepository : UserCrudRepository<User>
