# Netwon-Raphson
Newton Raphson Method is an open method and starts with one initial guess for finding real root of non-linear equations. Here, Code of Newton Raphson Method of Computer Oriented Numerical Methods in Java Language.
# Project title

Newton-Raphson Method


## Motivation

A University Assignment. Clearly Used to Solve anhy Porblem and Perform Computer Oriented Prolblems .


## Method and results

1. Start
2. Define function as f(x)
3. Define first derivative of f(x) as g(x)
4. Input initial guess (x0), tolerable error (e) 
   and maximum iteration (N)
5. Initialize iteration counter i = 1
6. If g(x0) = 0 then print "Mathematical Error" 
   and goto (12) otherwise goto (7) 
7. Calcualte x1 = x0 - f(x0) / g(x0)
8. Increment iteration counter i = i + 1
9. If i >= N then print "Not Convergent" 
   and goto (12) otherwise goto (10) 
10. If |f(x1)| > e then set x0 = x1 
    and goto (6) otherwise goto (11)
11. Print root as x1
12. Stop

## Repository overview

Provide an overview of the directory structure and files, for example:

├── README.md
├── out
├── Newton_code.iml
├── .idea
│   ├── misc.xml
│   ├── modules.xml
|   ├── vcs.xml
│   └── workspace.xml
└── src
    ├── Newton_code.java



## More resources

Referenced from Computer oriented Numerical Method Book By Rajaraman and our Faculty Dr. Shaligram Prajapat.


## About

You can say it has been part of a class you've taken at International Institute of Professional Studies, Indore.

