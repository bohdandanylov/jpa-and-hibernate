package learnspringboot.jpaandhibernate.course;

import learnspringboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLIneRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "SomeAuthor"));
        repository.insert(new Course(2, "Learn Azure", "SomeAuthor"));
        repository.insert(new Course(3, "Learn DevOps", "SomeAuthor"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}