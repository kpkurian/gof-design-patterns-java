# Prototype Pattern

## Intent
Specify the kind of objects to create using a prototypical instance, and create new objects by copying this prototype. This pattern is used when creation of object directly is costly. 

## Applicability
* When a system should be independent of how its products are created, composed and represented
* And any of the following
	* when the classes to instantiate are specified at run-time (may by dynamic loading)
	* to avoid building a class hierarchy of factories that parallels the class hierarchy of products
	* when instances of a class can have one of only a few different combinations of state (from a cache of objects which are already in the required state). 





## Consequences
#### Positives
1. *Hides concreate product classes from the client*
2. *Adding and removing products at run-time*
3. *Specifying new objects by varying values*
4. *Specifying new objects by varying structures*
5. *Reduced subclassing*
6. *Configuring an application with classes dynamically*

#### Negatives
1. *Might be difficult for all subclass to implement clone operation*
2. *Some internal objects might not support copying or might have circular reference*