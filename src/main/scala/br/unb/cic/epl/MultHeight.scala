package br.unb.cic.epl
import scala.math.max

package object MultHeight {
  class Mult(l: Height.Expression, r: Height.Expression) extends Mult.GMult with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = return max(lhs.height()+1, rhs.height()+1)
  }
}
