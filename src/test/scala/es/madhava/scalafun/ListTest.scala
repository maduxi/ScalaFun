package es.madhava.scalafun

import org.scalatest.FunSuite


class ListTest extends FunSuite {

  /* If a method ends with :, it will be invoked on the left operand */
  test("Prepend") {
    val twoThree = List(2,3)
    assert(1::twoThree == List(1,2,3))
  }

  test("New list"){
    val newlist = 1::2::3::Nil
    assert(newlist == List(1,2,3))
  }

  test("Append lists"){
    val newlist = List(1,2):::List(3,4)
    assert(newlist == List(1,2,3,4))
  }

  test("Thrill"){
    val thrill = "Will"::"Fill"::"Untill"::Nil
    //Words with length 4
    assert(thrill.count(_.length==4)==2)

    assert(thrill.drop(2)==List("Untill"))
    assert(thrill.dropRight(2)==List("Will"))
    assert(thrill.exists(_=="Untill"))
    assert(thrill.filter(_.length==4)=="Will"::"Fill"::Nil)
    //All words have 4 letters
    assert(!thrill.forall(_.length==4))
    assert(thrill.head=="Will")
    //All elements but last
    assert(thrill.init=="Will"::"Fill"::Nil)
    //All but first
    assert(thrill.tail=="Fill"::"Untill"::Nil)
    assert(!thrill.isEmpty)
    assert(thrill.last=="Untill")

    assert(thrill.map(_+"s")==List("Wills","Fills","Untills"))

    assert(thrill.mkString(",")=="Will,Fill,Untill")
    assert(thrill.filterNot(_.length==4)=="Untill"::Nil)

    assert(thrill.reverse == "Untill"::"Fill"::"Will"::Nil)
    //Return array sort by lowercased first char
    assert(thrill.sortWith((s,t)=>s.charAt(0).toLower<t.charAt(0).toLower) == "Fill"::"Untill"::"Will"::Nil)
  }
}
