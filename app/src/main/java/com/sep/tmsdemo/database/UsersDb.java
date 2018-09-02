package com.sep.tmsdemo.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.sep.tmsdemo.model.User;

@Database(entities = {User.class},version = 2)
public abstract class UsersDb extends RoomDatabase {

    public abstract DataAccessObject dataAccessObject();
}
