# Abstract Factory

## Problem to solve
1. We want to create multiple families of objects
2. The problem and details are to be abstracted from the Client
3. The client will only give command like "Create a Classic Chair for me." to the manager/owner. Now it doesn't care if we are doing it in factory at Pune or Mumbai. All he cares if about the output and he has given us the details required.

## Solution
- We first define the families we want to create (products).
- Then we define the common family of these multiple products under one.
- Example: Chair is of modern and classic type, Table is of modern, classic type as well. So we create classic and modern families under which chairs and tables will be produced

## Point to remember
- First define family of products
- Then define factory families
- To abstract creation of factory, we add a static method in the interface which will create the factory of required type (classic/modern)