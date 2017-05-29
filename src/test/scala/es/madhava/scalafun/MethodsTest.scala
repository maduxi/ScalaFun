package es.madhava.scalafun

import org.scalatest.FunSuite


class MethodsTest extends FunSuite {

  test("Ternary") {
    assert(Methods.ternary("test"))
    assert(!Methods.ternary("test2"))
  }

  test("Apply") {
    assert(Methods(2)==4)
  }

  test("Update") {
    Methods(2)="Test"
    assert(1==1)
  }


}
