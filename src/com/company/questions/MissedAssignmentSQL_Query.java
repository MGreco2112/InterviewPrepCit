package com.company.questions;

public class MissedAssignmentSQL_Query {
    /*
        SELECT name FROM student
        INNER JOIN
        late_work
        ON
        student.name = late_work.student_id
        ORDER BY name ASC;
    */

    //this resulted in duplicate entries of name and ID
    //This wanted one student listed per id per missing work
    //By using SELECT name, DISTINCT(id) at the top of the query got the correct answer, however the return format
        //requested simply the name returned.


    //solution discovered via googling
    //select NAME from student
    //where ID in (
    //  select distinct STUDENT_ID from backlog
    //  where backlog.SUBJECT_ID is not NULL
    //)
    //order by NAME asc;
}
