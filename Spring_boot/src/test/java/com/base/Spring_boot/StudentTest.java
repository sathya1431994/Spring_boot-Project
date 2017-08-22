package com.base.Spring_boot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;
@RunWith(MockitoJUnitRunner.class)
public class StudentTest {
private static final int Student_ID = 1;
private static final Student EXISTING_Student = new StudentBuilder().id(Student_ID).name("Micky").rollno("1234").build();
private static final Student ANOTHER_Student = new StudentBuilder().id(2).name("Minny").build();
private static final Student NEW_Student = new StudentBuilder().name("Micky").rollno("1234").build();
@InjectMocks
private Controller controller;
@Mock
private StudentRepository repo;
@Test
public void registerTest() {
    System.out.println(NEW_Student);
    System.out.println(EXISTING_Student);
given(repo.saveAndFlush(NEW_Student)).willReturn((EXISTING_Student));

assertThat(controller.register((NEW_Student))).isSameAs(EXISTING_Student);
}

@Test
public void show() {
given(repo.findAll()).willReturn(Arrays.asList(EXISTING_Student, ANOTHER_Student));
System.out.println(controller.show_data());
assertThat(controller.show_data()).containsOnly(EXISTING_Student, ANOTHER_Student);
}

/*@Test
public void delete() {
controller.remove(Student_ID);
System.out.println(Student_ID);
verify(repo).delete(Student_ID);
}*/
}

