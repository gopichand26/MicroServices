# MicroServices
EurekaServer with 3 clients

EurekaServer-8761
    Acts as a Server with clients of Student-Service, Marks-Service and StudentMarks-Service
    
Student Service-8181
    Obtained data from SQL
    Created table with name of Student of id,name

Marks Service-8282
    Obtained data from SQL
    Created table with name of marks of id,examid,sub1,sub2

StudentMarks Service-8383
    Obtained data from Student Service and Marks Service