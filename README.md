## Lego Mindstorms EV3
This project was a school project that I did in a team that consisted of 4 members including me.
In this project we had to program Lego Mindstorms robot to go through a obstacle track. The track had a black line that the robot followed and when the robot noticed that there were an obstacle it went around it

## Technical solutions of the program
Used technology: **Java**

Code consists of two packages: App and Data. The App package contains the main program and the Data package contains files for the motors and the sensors of the robot.
We have used threads for the motors and the sensors of the robot. The values that the sensors get are stored in variables that are in Data.java file. 

The motors of the robot get the values from Data.java and the robot acts according to the values that the motors get. For example if the robot notices that there are only 25cm or less to the nearest obstacle, the program calls method called obstacle() and the robot begins to go around the obstacle. Other features that the robot has are color identification (the robot follows black line and it stops if the sensor sees red color), the robot waves the flag it has, it calculates the time that the robot uses to go through the obstacle track, it calculates the obstacles that it observes and it has a touch sensor that commands the robot to back up if it collides to something.
