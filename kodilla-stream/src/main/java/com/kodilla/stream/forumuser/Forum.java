package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1000, "Norman Peter", 'M', 0, LocalDate.of(1994,5,5)));
        theForumUserList.add(new ForumUser(1001, "Peterra Norman", 'F', 22,LocalDate.of(1999,9,5)));
        theForumUserList.add(new ForumUser(1002, "Dany Peter", 'M', 32,LocalDate.of(2001,4,29)));
        theForumUserList.add(new ForumUser(1003, "Norman Parke", 'M', 10,LocalDate.of(2011,12,3)));
        theForumUserList.add(new ForumUser(1004, "Peter Griffin", 'M', 40,LocalDate.of(2007,1,4)));
        theForumUserList.add(new ForumUser(1005, "Fisher Woman", 'F', 0,LocalDate.of(1988,2,22)));
        theForumUserList.add(new ForumUser(1006, "Luis Griffin", 'F', 605,LocalDate.of(1991,11,11)));
        theForumUserList.add(new ForumUser(1007, "Steve Griffin", 'M', 0,LocalDate.of(2004,10,9)));
    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUserList);
    }
}
