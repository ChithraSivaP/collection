package com.kgisl.task.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kgisl.task.entity.Tutorial;



@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
   @Query("SELECT t FROM Tutorial t WHERE t.published=?1")
    List<Tutorial> findByPublished(boolean published);

    @Query("SELECT t FROM Tutorial t WHERE t.published=?1")
    List<Tutorial> getByPublished(boolean published);

    @Query("SELECT t FROM Tutorial t WHERE t.published=?1")
    List<Tutorial> readByPublished(boolean published);                                                 
                                            

    
    List<Tutorial> findByTitleContaining(String title);

    @Query(nativeQuery = true,value = "select count('title')from tutorials where title ='lol'")
    long countEntities();
 
}
  