package com.lld.reviewSystem.repository;

import com.lld.reviewSystem.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    public static List<User> users = new ArrayList<>();
    public static Map<String, User> usersMap = new HashMap<>();
}
