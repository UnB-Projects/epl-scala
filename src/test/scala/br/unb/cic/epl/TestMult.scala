package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMult extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Multiplication expression"

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
  }

  it should "return String (100 * 200) when we call Mult(Literal(100), Literal(200).print())" in {
    val mult = new MultEval.Mult(literal100, literal200)
  
    mult.print() should be ("(100 * 200)")
  }

  it should "return 20000 when we call call Mult(Literal(100), Literal(200)).eval()" in {
    val mult = new MultEval.Mult(literal100, literal200)

    mult.eval() should be (20000)
  }
}
