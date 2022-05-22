package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer,ForumUser> theResultMapOfUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPostsQty() > 0)
                .filter(forumUser -> Period.between(forumUser.getBirthDayDate(), LocalDate.now()).getYears() >= 20)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " +theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() +": " +entry.getValue())
                .forEach(System.out::println);

    }
}
