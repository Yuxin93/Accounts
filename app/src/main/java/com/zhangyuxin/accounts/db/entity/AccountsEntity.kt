package com.zhangyuxin.accounts.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.PrimaryKey

//Fts4 全文搜索访问数据库信息
@Fts4
@Entity(tableName = "accounts_entity")
data class AccountsEntity(
    @PrimaryKey(autoGenerate = true) var id: String,
    var amount: Int,//金额 单位分
    @ColumnInfo(name = "category_id") var categoryId: Int,//分类ID
    var note: String,//备注
    var date: String,//发生日期
    @ColumnInfo(name = "income_or_expense") var incomeOrExpense: Int,//0 支出 1 收入
    @ColumnInfo(name = "create_time") var createTime: String,//首次创建时间
    @ColumnInfo(name = "update_time") var updateTime: String,//编辑时间
)