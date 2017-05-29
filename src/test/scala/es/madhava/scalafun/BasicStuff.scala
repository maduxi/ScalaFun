package es.madhava.scalafun

import org.scalatest.FunSuite


class BasicStuff extends FunSuite {

  test("Direct casts") {
    assert("5".toInt === 5)
    assert("true".toBoolean)
    assert(!"false".toBoolean)
  }

  test("Strings") {
    //Contains w
    assert("Hello world".exists(_.equals('w')))

    //! Contains x
    assert(!"Hello world".exists(_.equals('x')))
  }

}
