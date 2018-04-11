import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Sub
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.Mult
import br.unb.cic.epl.MultEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new AddEval.Add(lit100, lit500)
  val sub = new Sub.Sub(lit100, lit500)
  val mult = new Mult.Mult(lit100, lit500) 


  println(sum.print())
  println(sum.eval())
  println(lit100.eval())

  println(sub.print())
}
