@file:Suppress("Since15")

package com.example.mywishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Suppress("Since15")
@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend  fun addWish(wishEntity: Wish)
    // get all the items from the table
    @Query("Select *From `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>
    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select *From `wish-table` Where id=:id")
    abstract fun getAWishesById(id:Long): Flow<Wish>


}