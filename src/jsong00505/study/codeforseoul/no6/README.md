#Abstract and Static

## Abstract

This is pretty hard subject to understand. Database is good example.

[IWritable]     [IHoldable]
    |               |
    -------------------------------------
            |                           |
    [AbstractWritingTool]   [AbstractPrintingTool]
            |                           |
  ---------------------------------------
  |                 |                  |
[Pen]           [Pencil]        [HandPrinter]


                [WritingTool-writingMaterial]
                             |
        ________________________________________
        |                                       |
[Pen-writingMaterial=ink]       [Pencil-writingMaterial=graphite]
        |                                       |
        -----------------------------------------
                             |
        [CombinationPenPencil-writingMaterial=????]     **PROBLEM**

### interface vs abstract
interface inheritance only one time, and the inherited class must have methods of the interface. It is mandatory.
abstract inheritance many times. Interface is only for behavior. **skeleton class**

interface is better than abstract.


## Static

Question: [Benefits of using static variables and methods in Java - closed]
(http://stackoverflow.com/questions/5795825/benefits-of-using-static-variables-and-methods-in-java)

* static
* final

`not static value should be in Object, so you can access the value through Object.`

`Apple picker example` : should re-watch what he said.