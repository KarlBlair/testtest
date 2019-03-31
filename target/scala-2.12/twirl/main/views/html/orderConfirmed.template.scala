
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Member,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(member: models.users.Member, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.users.Member


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", member)/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Item Price</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*31.18*/if(order != null)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
                    """),format.raw/*32.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*33.22*/for(i <- order.getItems) yield /*33.46*/ {_display_(Seq[Any](format.raw/*33.48*/("""
                    """),format.raw/*34.21*/("""<tr>
                        <td>"""),_display_(/*35.30*/i/*35.31*/.getOrder.getId),format.raw/*35.46*/("""</td>
                        <td>&euro; """),_display_(/*36.37*/("%.2f".format(i.getPrice))),format.raw/*36.64*/("""</td>
                        <td>&euro; """),_display_(/*37.37*/("%.2f".format(i.getItemTotal))),format.raw/*37.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*39.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*40.16*/("""
			"""),format.raw/*41.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; 
                    """),_display_(/*46.22*/("%.2f".format(order.getOrderTotal))),format.raw/*46.58*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(member:models.users.Member,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(member,order)

  def f:((models.users.Member,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (member,order) => apply(member,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/orderConfirmed.scala.html
                  HASH: f450aa638ea8e2ab00865592fb8a10d3a213ed46
                  MATRIX: 996->1|1132->68|1168->98|1200->124|1255->65|1283->151|1310->152|1381->198|1423->232|1462->234|1492->237|1565->284|1606->316|1646->318|1679->324|1750->368|1764->373|1800->388|1833->394|1873->404|1905->409|2164->641|2190->658|2230->660|2279->681|2389->764|2429->788|2469->790|2518->811|2579->845|2589->846|2625->861|2694->903|2742->930|2811->972|2863->1003|2947->1056|3018->1096|3049->1100|3246->1270|3303->1306
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|68->37|68->37|70->39|71->40|72->41|77->46|77->46
                  -- GENERATED --
              */
          