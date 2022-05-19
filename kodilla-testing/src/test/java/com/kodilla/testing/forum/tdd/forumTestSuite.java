package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum test suite")
class forumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" +testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts {
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            //When
            forumUser.addPost("mrsmith", "post example");
            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }

        @Test
        void testGetPost(){
            //Given
            ForumUser forumUser = new ForumUser("drstrange","Benedict Cumberbatch");
            ForumPost thePost = new ForumPost("post example", "drstrange");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);
            //Then
            Assertions.assertEquals(thePost,retrievedPost);
        }

        @Test
        void testRemovePostNotExisting(){
            //Given
            ForumUser forumUser = new ForumUser("tesla","Nikola Tesla");
            ForumPost thePost = new ForumPost("post example","tesla");
            //When
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemovePost(){
            //Given
            ForumUser forumUser = new ForumUser("sagan","Carl Sagan");
            ForumPost thePost = new ForumPost("post example","sagan");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //When
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0,forumUser.getPostsQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestComment {
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("drstrange", "Benedict Cumberbatch");
            ForumPost thePost = new ForumPost("post example", "drstrange");
            //When
            forumUser.addComment(thePost, "drstrange", "comment example");
            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }

        @Test
        void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("ironman", "Robert Downey Jr.");
            ForumPost thePost = new ForumPost("post example", "ironman");
            ForumComment theComment = new ForumComment(thePost, "ironman", "comment example");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //When
            ForumComment retrievedComment = forumUser.getComment(0);
            //Then
            Assertions.assertEquals(theComment, retrievedComment);
        }

        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("tesla", "Nikola Tesla");
            ForumPost thePost = new ForumPost("post example", "tesla");
            ForumComment theComment = new ForumComment(thePost, "comment example", "tesla");
            //When
            boolean result = forumUser.removeComment(theComment);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("sagan", "Carl Sagan");
            ForumPost thePost = new ForumPost("post example", "sagan");
            ForumComment theComment = new ForumComment(thePost, "comment example", "sagan");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //When
            boolean result = forumUser.removeComment(theComment);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
}

