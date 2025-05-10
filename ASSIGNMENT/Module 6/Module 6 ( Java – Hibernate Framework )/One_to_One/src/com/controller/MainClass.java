package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Profile;
import com.model.User;

public class MainClass 
{

    public static void main(String[] args) 
    {

    	Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		

            // Create User and Profile
            User user = new User("Demo");
            Profile profile = new Profile("USA");

            // Associate Profile with User
            user.setProfile(profile);
            profile.setUser(user);

            // Save the user (Profile will also be saved because of CascadeType.ALL)
            sess.save(user);

            // Commit the transaction
            tr.commit();

          
    }
}
