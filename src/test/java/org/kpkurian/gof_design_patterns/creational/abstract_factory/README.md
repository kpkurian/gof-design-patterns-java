# Abstract Factory Pattern
#### AKA - Kit

## Intent
Provide an interface for creating families of related or dependent objects without specifying their concrete classes


## Applicability
* When system should be independent of how its products are created, composed and represented
* When a system is configured with one of multiple families of products
* When a family of related product objects is designed to be used together, and you need to enforce this constraint
* When you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations





## Consequences
#### Positives
1. *It isolates concrete classes*
2. *It makes exchanging product families easy*
3. *It promotes consistency among products*
4. *It promotes consistency among products*

#### Negatives
1. *Supporting new kinds of products is difficult*