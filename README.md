## Lego Mindstorms EV3
This project was a school project that I did in a team that consisted of 4 members including me.
In this project we had to program Lego Mindstorms robot to go through a obstacle track. The track had a black line that the robot followed and when the robot noticed that there were an obstacle it went around it

## Technical solutions of the program
Used technology: **Java**

Code consists of two packages: App and Data. The App package contains the main program and the Data package contains files for the motors and the sensors of the robot.
We have used threads for the motors and the sensors of the robot. The values that the sensors get are stored in variables that are in Data.java file. The motors of the robot get the values from Data.java and the robot acts according to the values that the motors get. If the robot notices that there is only 25cm or less to the nearest obstacle, the program calls method called obstacle() and the robot begin to go around the obstacle.
