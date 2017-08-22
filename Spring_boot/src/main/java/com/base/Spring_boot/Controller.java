package com.base.Spring_boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class Controller
 {

       @Autowired
  private StudentRepository srt;

@RequestMapping("/wel")

String first()
 {
return "hi hello!";
}

// Show the data from the database (MYSQL)
    @RequestMapping(value="/show",method = RequestMethod.GET)

  public List<Student> show_data() 
  {
    return srt.findAll();
  }

//Add the data into the database (MYSQL)

    @RequestMapping(value="/register",method = RequestMethod.GET)

  public Student register(Student std) 
  {
     return srt.saveAndFlush(std);
  }

//Filter the data

  @RequestMapping(value="filter",method=RequestMethod.GET)
 public List<Student> getdata(@RequestParam("department") String dept,@RequestParam("rollno") String id)
  {
    return srt.getbydept(dept,id);
  }
  


/*

 //Delete the data from database

   @RequestMapping(value="/delete",method = RequestMethod.DELETE)
   public void remove(Student std)
   {
   //  std.setId(id);
      srt.delete(std);
   }

// Update the data into database 
*/
}
