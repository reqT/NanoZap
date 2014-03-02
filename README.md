NanoZap
=======

A minimalistic Scala DSL for testing.

Example usage
=============

```scala    
object myTestCases extends reqT.NanoZap {
 def zap: Boolean = test("Arithmetic basics") { 
   "basic addition" .
       test { 1 + 1 == 3 } +
   "associativity of multiplication" .
       test { 2 * 3 == 3 * 2 } 
  }
}
```

String is pimped with a test method that can be used to accumulate non-empty strings. 

NanoZap gets loud when a non-empty string is detected.

```
scala> :pa
// Entering paste mode (ctrl-D to finish)

   object myTestCases extends reqT.NanoZap {
    def zap: Boolean = test("Arithmetic basics") {
      "basic addition" .
          test { 1 + 1 == 3 } +
      "associativity of multiplication" .
          test { 2 * 3 == 3 * 2 }
     }
   }

// Exiting paste mode, now interpreting.

defined module myTestCases

scala> myTestCases.zap
NanoZap test(Arithmetic basics) ... ZAPPED!
*** TEST FAILED: basic addition

res0: Boolean = false

scala>
```
