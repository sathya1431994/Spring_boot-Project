package com.base.Spring_boot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import java.util.*;

public interface StudentRepository extends Repository<Student, Integer>,JpaRepository<Student,Integer> 
{

//String val="select s.id,s.rollno,s.name from Student s left join s.Department d ON (s.dept_id = d.dept_id)";

   // @Query("SELECT e.name,er.dept_name FROM Student e left join e.dept_id er where er.dept_name=:dept")
  @Query("select  s.name,s.rollno,d.dept_name from Student s left join s.dept_id d  where  ((d.dept_name=:dept and s.rollno=:id) or (d.dept_name=:dept or s.rollno=''))")
  public List<Student> getbydept(@Param("dept") String department,@Param("id") String id);

}