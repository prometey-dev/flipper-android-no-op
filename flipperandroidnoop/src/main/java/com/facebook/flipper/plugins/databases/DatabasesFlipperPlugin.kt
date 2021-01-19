package com.facebook.flipper.plugins.databases

import android.content.Context
import com.facebook.flipper.core.FlipperPlugin
import com.kgurgul.flipper.RealmDatabaseDriver

class DatabasesFlipperPlugin(context: Context) : FlipperPlugin() {

    constructor(realmDatabaseDriver: RealmDatabaseDriver) : this(realmDatabaseDriver.context)

}