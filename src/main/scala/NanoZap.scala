/***     
**                  _______        
**                 |__   __|   reqT - a requriements engineering tool  
**   _ __  ___   __ _ | |      (c) 2011-2014, Lund University  
**  |  __|/ _ \ / _  || |      http://reqT.org
**  | |  |  __/| (_| || |   
**  |_|   \___| \__  ||_|   
**                 | |      
**                 |_|      
** reqT is open source, licensed under the BSD 2-clause license: 
** http://opensource.org/licenses/bsd-license.php 
**************************************************************************/

package reqT 
/**
  * reqT.NanoZap -- A minimalistic DSL for testing.
  */
  
trait NanoZap {
  implicit class StringTest(string: String) { 
    def test(isOk: Boolean):String = 
        if (isOk) "" else s"*** TEST FAILED: $string\n" 
  }
  
  def test(name: String)(report: String): Boolean = {
    print(s"NanoZap test($name) ... ")
    if (report.isEmpty) println("Ok!") else println(s"ZAPPED!\n$report")
    report == ""
  }
}

object NanoZap extends NanoZap 
