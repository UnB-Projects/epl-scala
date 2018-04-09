package br.unb.cic.epl

package object Mult {
  trait GMult extends Core.Expression {
    type T <: Core.Expression
    var lhs: T = _ 
    var rhs: T = _ 
    override def print(): String = "(" + lhs.print() + " * " + rhs.print() + ")" 
  }

  class Mult(l: Core.Expression, r: Core.Expression) extends GMult {
    type T = Core.Expression

    lhs = l
    rhs = r
  }
}

