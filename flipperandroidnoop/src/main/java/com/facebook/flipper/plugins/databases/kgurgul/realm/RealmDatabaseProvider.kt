package com.kgurgul.flipper

interface RealmDatabaseProvider {
    fun getRealmConfigurations(): List<Any>
}