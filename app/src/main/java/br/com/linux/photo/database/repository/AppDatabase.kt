package br.com.linux.photo.database.repository

import android.content.Context
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.linux.photo.database.dao.UserDao
import br.com.linux.photo.model.User

@Database(
    entities = [User::class],
    version = 1,
    autoMigrations = [
        AutoMigration(to = 0, from = 1)
    ],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "photo.db"
            ).build()
        }
    }
}