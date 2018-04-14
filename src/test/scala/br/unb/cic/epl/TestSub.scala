package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestSub extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Subtraction expression"

  var literal100: Eval.Literal   = _
  var literal200: Eval.Literal   = _
  var literal300: Height.Literal = _
  var literal400: Height.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
    literal300 = new Core.Literal(300) with Height.Literal
    literal400 = new Core.Literal(400) with Height.Literal
  }

  it should "return String (100 - 200) when we call Sub(Literal(100), Literal(200).print())" in {
    val sub = new SubEval.Sub(literal100, literal200)
  
    sub.print() should be ("(100 - 200)")
  }

  it should "return -100 when we call call Sub(Literal(100), Literal(200)).eval()" in {
    val sub = new SubEval.Sub(literal100, literal200)

    sub.eval() should be (-100)
  }

  it should "return 2 when we call call Sub(Literal(300), Literal(400)).height()" in {
    val sub = new SubHeight.Sub(literal300, literal400)

    sub.height() should be (2)
  }

  it should "return 3 when we call call Sub(Sub(literal300, literal400), Sub(literal300, literal400)).height()" in {
    val sub = new SubHeight.Sub(new SubHeight.Sub(literal300, literal400),
                                new SubHeight.Sub(literal300, literal400))

    sub.height() should be (3)
  }
}
