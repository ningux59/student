/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author 18736
 */
public class Parttimestudent extends Student{
    private int numCourses;
   public Parttimestudent( int numofC){
numCourses =numofC;
}

public int getNumCourses() {
return numCourses;
}

public void setNumCourses(int numCourses) {
this.numCourses = numCourses;
}


}
