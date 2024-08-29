package br.com.linux.photo.database.dao

import androidx.room.Dao
import androidx.room.Insert
import br.com.linux.photo.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun save(user: User)
}