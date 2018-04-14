package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestAdd extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Add expression"

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

  it should "return String (100 + 200) when we call Add(Literal(100), Literal(200).print())" in {
    val add = new AddEval.Add(literal100, literal200)
  
    add.print() should be ("(100 + 200)")
  }

  it should "return 300 when we call call Add(Literal(100), Literal(200)).eval()" in {
    val add = new AddEval.Add(literal100, literal200)

    add.eval() should be (300)
  }

  it should "return 2 when we call call Add(Literal(300), Literal(400)).height()" in {
    val add = new AddHeight.Add(literal300, literal400)

    add.height() should be (2)
  }

  it should "return 3 when we call call Add(Add(literal300, literal400), Literal(400)).height()" in {
    val add = new AddHeight.Add(new AddHeight.Add(literal300, literal400), literal400)

    add.height() should be (3)
  }
}
