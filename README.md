# JPACRUDProject

## Overview
This full stack pplication alllowes a user to manage an inventory of shoes.  They are abe to add a shoe, delete a shoe, and update a shoe.  They can also view all the shoes in the collection.

## Technoliges used

Gradle
Spring boot
Java
sql
JPA
Bootstrap
HTMl
Apache Tomcat

## Lessons Learned
This project reinforced the elemtns of a full-project.  It was the first time I completed a full-stack on my own.  Learning how to wire the different tehnoliges has now settled in.  I used JPA for this project on the backend which really cleans up the database communication.  I also added bootstrap to the front end for some visual imporvements for the first time.  However, the biggest and most painful lesson waslabeling my variables with reserved words.  I used status for the condition of the shoes.  This variable casued errors when being passed because the system was taking it as a http element.  Then i changd the variable to condition only to find that was a reserved word for sql.  Half the proejct was spent figuring out the same probelm twice.  
