package br.com.linux.photo.repository

import br.com.linux.photo.database.dao.UserDao
import br.com.linux.photo.model.User

class UserRepository(
    private val userDao: UserDao
) {
    suspend fun save(user: User) = userDao.save(user)
}