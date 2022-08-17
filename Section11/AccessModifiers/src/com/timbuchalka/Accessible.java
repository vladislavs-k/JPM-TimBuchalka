package com.timbuchalka;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {          //visibility should be public? (package-private)
    int SOME_CONSTANT = 100;    //visibility should be public
    public void methodA();      //visibility should be public
    void methodB();             //visibility should be public
    boolean methodC();          //visibility should be public
}
