package com.Hibernet.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import com.Hibernate.OneToManyMapping.dao.CourseDao;
import com.Hibernate.OneToManyMapping.dao.InstructorDao;
import com.Hibernate.OneToManyMapping.entity.Course;
import com.Hibernate.OneToManyMapping.entity.Instructor;
import com.Hibernate.OneToManyMapping.entity.InstructorDetail;


public class App 
{
    public static void main( String[] args )
    {
        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com"); 
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
        // associate the objects
        instructorDetail.setInstructor(instructor);
        // associate the objects
        instructor.setInstructorDetail(instructorDetail);
        
        Instructor instructor1 = new Instructor("Amit", "Varma", "amitv45@javaguides.com");
        InstructorDetail instructorDetail1 = new InstructorDetail("http://www.youtube.com", "Piano");
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
        
        List<Course> courses = new ArrayList<>();
        // create some courses
        Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
        tempCourse1.setInstructor(instructor);
        courses.add(tempCourse1);
        
        
        Course tempCourse2 = new Course("The Pinball Masterclass");
        tempCourse2.setInstructor(instructor1);
        courses.add(tempCourse2);
        
        CourseDao coursedao = new CourseDao();
        coursedao.saveCourse(tempCourse1);
        coursedao.saveCourse(tempCourse2);        
        
        /*InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);
        instructorDao.saveInstructor(instructor1);*/
        
    }
    }