package learnspringboot.jpaandhibernate.course.springdatajpa;

import learnspringboot.jpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
