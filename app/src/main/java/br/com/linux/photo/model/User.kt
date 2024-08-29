package br.com.linux.photo.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
class User(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val user: String,
    val name: String,
    val password: String,
) : Parcelable {
    fun userIsValid(): Boolean {
        return !(user.isBlank() || name.isBlank() || password.isBlank() && password.length < 5)
    }
}