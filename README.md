# Interfaces.Visitor-Pattern
COMP 373 simple implementation of the visitor pattern.

It consists of a patient who attend a hospitat. The visitor is the patient, and those who are being visited are the nurses and doctors.

Problem:
Defining a new operation required changing the elements, in this case, it would require the doctor and nurse to be changed.

Solution:
The object structure being those being visited, calls the visitor operation( patient), and visits each elements(doctor, nurse)
To Run: 

Clone this repository to your local device.
Open the project in your IDE of choice.
Build the project and run it using the RunClient.java file.( Run Client unfinished)