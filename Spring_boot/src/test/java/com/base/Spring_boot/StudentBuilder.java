package com.base.Spring_boot;
public class StudentBuilder {
private Student std = new Student();
public StudentBuilder id(int id) {
std.setId(id);
return this;
}
public StudentBuilder name(String name) {
std.setName(name);
return this;
}
public StudentBuilder rollno(String rollno) {
std.setRollno(rollno);
return this;
}
public Student build() {
return std;
}


}