package com.base.Spring_boot;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;

@Entity
public class Department
{
    @Id
    @Column(name="dept_id")
    int dept_id;
    @Column
    String dept_name;
    
@OneToMany(cascade = CascadeType.ALL)
    private List<Student> student;

    public void setId(int dept_id)
    {
        this.dept_id=dept_id;
    }

    public int getId()
        {
            return dept_id;
        }

        public void setDept_id(String dept_name)
        {
            this.dept_name=dept_name;
        }

        public String getDept_name()
        {
            return dept_name;
        }

public List<Student> getStudent()
    {
        return student;
    }
    public void setStudent(List<Student> student)
    {
        this.student=student;
    }

}