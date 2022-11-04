# SER515_UnitTest
this repository contains solution to the assignment on SER515 Unitest Reuse

SER515
Assignment: Unit Test/Reuse (Individual) 

Script to run all branches

At the starting page user can perform the following tasks
Enter  username and password. Here user can select between student and instructor from the radio buttons. Username and passwords will be read from the file StudentInfo.txt if student is selected as a role or InstructorInfo.text if instructor is selected as a role.
Exit from the system

After logging in below are the branches that will be covered depending on the role selected in the login page.

A) Logged in as a Instructor

After logging in as instructor, instructor will be redirected to another GUI where he/she can perform two task 

between two types of course i.e high level course or low level course.
a course from the dropdown menu which will be read from the file UserCourse.txt and display courses corresponding to the instructor username. 
Logout from the system.

After selecting the type of course and course name click OK and the instructor will be redirected to the assignment view/add page. Here instructor can perform the following tasks

View previously added assignment, edit the content
View previously added assignment to which a student has submitted the solution, grade the assignment and report it.
Add a new assignment and provide its name, due date, suggested solution. Here the instructor can neither grade nor report the assignment as no solutions are added yet by any student.
Instructor can also change the course type from the selected type by clicking the button “Change Course” where he can perform tasks from 1.
Logout from the system.

B) Logged in as a Student

After logging in the system as a student, students will be redirected to a page where they can view all upcoming and past due dates of all assignments posted by the instructor.

After clicking OK, they will be directed to the page where they can select from the courses they opted for. The opted course will be read from file UserCourse.txt.

Here students can perform the following tasks.

Select type of course from high level course and low level course
Select course they want to view assignments or write solution for
Logout of the system.
Click OK with selected course type and course name

After clicking OK, students will be redirected to the page where they can select from all assignments posted for the course name selected in the previous page. Here they can perform following tasks

Select and assignment from the dropdown and view assignment
View assignment and perform following tasks

Add solution
View grades. Grades will be initially set to -1. Instructors can change the grades and report them to students when they login.
Submit solution. After this student will be redirected to the previous page
Cancel 


Change course level 
Logout from system


