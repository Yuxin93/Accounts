package com.zhangyuxin.accounts.db.dao

import androidx.room.*
import com.zhangyuxin.accounts.db.entity.AccountsEntity

@Dao
interface AccountsDao {

    @Insert
    fun insertAccount(vararg account: AccountsEntity)

    @Update
    fun updateAccount(account: AccountsEntity)

    @Delete
    fun deleteAccount(account: AccountsEntity)

    @Query("SELECT * FROM accounts_entity WHERE id = :mId")
    fun queryAccount(mId: String): AccountsEntity

    @Query("SELECT * FROM accounts_entity LIMIT :pageSize OFFSET (:pageNo-1)*:pageSize")
    fun queryAll(pageNo: Int, pageSize: Int): MutableList<AccountsEntity>
}