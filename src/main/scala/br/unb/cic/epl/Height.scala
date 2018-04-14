package br.unb.cic.epl

package object Height { 
  trait Expression extends Core.Expression {
    def height(): Int
  }

  trait Literal extends Core.Literal with Expression {
    override
    def height(): Int = return 1
  }
}
