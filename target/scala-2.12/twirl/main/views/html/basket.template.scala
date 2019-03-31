
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.users.User
/*7.2*/import models.users.Member


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Shopping Basket", user)/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

        """),format.raw/*21.9*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>ID</th>
                    <th>Item Price</th>
                    <th>Total</th>
                    <th>dec.</th>
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*32.22*/if(user.getBasket() != null)/*32.50*/ {_display_(Seq[Any](format.raw/*32.52*/("""
                        """),format.raw/*33.25*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*34.26*/for(i <- user.getBasket().getBasketItems()) yield /*34.69*/ {_display_(Seq[Any](format.raw/*34.71*/("""
                        """),format.raw/*35.25*/("""<tr>
                            <td>"""),_display_(/*36.34*/i/*36.35*/.getOrder.getId),format.raw/*36.50*/("""</td>
                            <td>&euro; """),_display_(/*37.41*/("%.2f".format(i.getPrice))),format.raw/*37.68*/("""</td>
                            <td>&euro; """),_display_(/*38.41*/("%.2f".format(i.getItemTotal))),format.raw/*38.72*/("""</td>
                            <td><a href=""""),_display_(/*39.43*/routes/*39.49*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*39.81*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        </tr>
                        """)))}),format.raw/*41.26*/("""<!-- End of For loop -->
                  """)))}),format.raw/*42.20*/("""
                """),format.raw/*43.17*/("""</tbody>
            </table>

		
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*49.69*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*49.115*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*55.31*/routes/*55.37*/.ShoppingCtrl.emptyBasket()),format.raw/*55.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.ShoppingCtrl.placeOrder()),format.raw/*61.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*71.24*/("""{"""),format.raw/*71.25*/("""
		"""),format.raw/*72.3*/("""return confirm('Are you sure?');
	"""),format.raw/*73.2*/("""}"""),format.raw/*73.3*/("""
"""),format.raw/*74.1*/("""</script>
""")))}))
      }
    }
  }

  def render(user:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/basket.scala.html
                  HASH: 22334e83a4a6c318c78d5725198b66a04e7ab72c
                  MATRIX: 962->1|1062->32|1098->62|1130->88|1162->114|1217->29|1245->141|1272->143|1309->172|1348->174|1378->177|1451->224|1492->256|1532->258|1565->264|1636->308|1650->313|1686->328|1719->334|1759->344|1797->355|2206->737|2243->765|2283->767|2336->792|2450->879|2509->922|2549->924|2602->949|2667->987|2677->988|2713->1003|2786->1049|2834->1076|2907->1122|2959->1153|3034->1201|3049->1207|3102->1239|3252->1358|3327->1402|3372->1419|3563->1583|3631->1629|3838->1809|3853->1815|3901->1842|4223->2137|4238->2143|4285->2169|4612->2468|4641->2469|4671->2472|4732->2506|4760->2507|4788->2508
                  LINES: 28->1|31->4|32->5|33->6|34->7|37->2|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|69->38|69->38|70->39|70->39|70->39|72->41|73->42|74->43|80->49|80->49|86->55|86->55|86->55|92->61|92->61|92->61|102->71|102->71|103->72|104->73|104->73|105->74
                  -- GENERATED --
              */
          