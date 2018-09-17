package com.sep.UniTrips.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.sep.UniTrips.model.User;

@Database(entities = {User.class},version = 1)
public abstract class UsersDb extends RoomDatabase {

    public abstract DataAccessObject dataAccessObject();
}
