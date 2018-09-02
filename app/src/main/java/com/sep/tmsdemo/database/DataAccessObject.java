package com.sep.tmsdemo.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.sep.tmsdemo.model.User;

import java.util.List;

@Dao
public interface DataAccessObject {

    @Insert
    public void addUser(User user);

    /**
     * This query will return all the courses that in the database
     * @return all the courses that in the database
     */
    @Query("select * from users where username = :username")
    public User getUser(String username);

    @Query("select * from users where username = :username AND password = :password")
    public User checkPassword(String username, String password);

}
