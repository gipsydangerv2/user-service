package com.ankit.userservice.userservice.repository;

import com.ankit.userservice.userservice.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static Map<String, User> userMap;

    static {
        userMap = new HashMap<>();

        User user1 = new User("userId-1", "user-one", "user.one@gmail.com",
                "1234567890", null);
        User user2 = new User("userId-2", "user-two", "user.two@gmail.com",
                "1234657890", null);
        User user3 = new User("userId-3", "user-three", "user.three@gmail.com",
                "1234523890", null);
        User user4 = new User("userId-4", "user-four", "user.four@gmail.com",
                "1234543890", null);
        User user5 = new User("userId-5", "user-five", "user.five@gmail.com",
                "1234567890", null);
        User user6 = new User("userId-6", "user-six", "user.six@gmail.com",
                "1234587890", null);
        User user7 = new User("userId-7", "user-seven", "user.seven@gmail.com",
                "1234566890", null);
        User user8 = new User("userId-8", "user-eight", "user.eight@gmail.com",
                "1234897890", null);
        User user9 = new User("userId-9", "user-nine", "user.nine@gmail.com",
                "1234566690", null);
        User user10 = new User("userId-10", "user-ten", "user.ten@gmail.com",
                "1234533890", null);

        userMap.put("userId-1", user1);
        userMap.put("userId-2", user2);
        userMap.put("userId-3", user3);
        userMap.put("userId-4", user4);
        userMap.put("userId-5", user5);
        userMap.put("userId-6", user6);
        userMap.put("userId-7", user7);
        userMap.put("userId-8", user8);
        userMap.put("userId-9", user9);
        userMap.put("userId-10", user10);
    }

    public static User getUserById(String userId) {
        User user = userMap.get(userId);
        return user == null ? null : new User(user);
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }
}
