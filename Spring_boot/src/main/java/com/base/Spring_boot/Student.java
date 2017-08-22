package com.base.Spring_boot;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student
{
 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.IDENTITY) 
     private int id;
     @Column
     private String name;
    @Column
     private String rollno;
   @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id",referencedColumnName="dept_id")
    private Department dept_id;
      public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public String getRollno()
    {
        return rollno;
    }
    public void setRollno(String rollno)
    {
        this.rollno=rollno;
    }

     public Department getDept_id()
    {
        return dept_id;
    }
    public void setDept_id(Department dept_id)
    {
        this.dept_id=dept_id;
    }
    public String toString()
    {
        return id+" "+name+" "+rollno;
    }
}