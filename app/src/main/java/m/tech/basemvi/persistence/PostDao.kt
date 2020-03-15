package m.tech.basemvi.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import m.tech.basemvi.models.Post

@Dao
interface PostDao {

    @Insert(onConflict = REPLACE)
    fun insertPosts(posts: List<Post>)

    @Query("SELECT * FROM post")
    fun getPosts(): LiveData<List<Post>>
}