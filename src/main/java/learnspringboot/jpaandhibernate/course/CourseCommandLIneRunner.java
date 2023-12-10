package learnspringboot.jpaandhibernate.course;

import learnspringboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import learnspringboot.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLIneRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "SomeAuthor"));
        repository.save(new Course(2, "Learn Azure", "SomeAuthor"));
        repository.save(new Course(3, "Learn DevOps", "SomeAuthor"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("SomeAuthor"));
        System.out.println(repository.findByAuthor("EmptyTest"));

        System.out.println(repository.findByName("Learn Azure"));
        System.out.println(repository.findByName("Learn DevOps"));
    }
}
