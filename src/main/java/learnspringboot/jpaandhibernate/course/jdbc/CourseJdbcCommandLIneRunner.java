package learnspringboot.jpaandhibernate.course.jdbc;

import learnspringboot.jpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLIneRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "SomeAuthor"));
        repository.insert(new Course(2, "Learn Azure", "SomeAuthor"));
        repository.insert(new Course(3, "Learn DevOps", "SomeAuthor"));

        repository.deleteById(1);

    }
}
