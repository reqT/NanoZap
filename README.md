NanoZap
=======

A minimalistic Scala DSL for testing.

Example usage
=============

String is pimped with a test method that can be used to accumulate non-empty strings. NanoZap gets loud when a non-empty string is detected.

'''scala    
   object myTestCases extends reqT.NanoZap {
    def zap: Boolean = test("Arithmetic basics") { 
      "basic addition" .
          test { 1 + 1 == 3 } +
      "associativity of multiplication" .
          test { 2 * 3 == 3 * 2 } 
     }
   }
'''
