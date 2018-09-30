package pl.coderslab.tweeter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    Collection<Tweet> findByUserId(long id);

    // @Query(value = "select u from User u where u.title like Programo%")
    //Collection<Tweet> findByTitle();
}
