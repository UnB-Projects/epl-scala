package br.unb.cic.epl

package object MultEval {
  class Mult(l: Eval.Expression, r: Eval.Expression) extends Mult.GMult with Eval.Expression {
    type T = Eval.Expression
    lhs = l
    rhs = r

    override def eval(): Int = lhs.eval() * rhs.eval()
  }
}
