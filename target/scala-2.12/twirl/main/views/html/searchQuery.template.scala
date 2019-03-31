
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

object searchQuery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Houses],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: List[models.Houses], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Search", user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Search Results</h1>

    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th>Image</th>
                <th>ID</th>
                <th>Bedrooms</th>
                <th>Bathrooms</th>
                <th>Price</th>
                <th>Garden Size</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*19.14*/for(i<-results) yield /*19.29*/ {_display_(Seq[Any](format.raw/*19.31*/("""
				"""),format.raw/*20.5*/("""<tr>
			        """),_display_(/*21.13*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*21.94*/ {_display_(Seq[Any](format.raw/*21.96*/("""
			        """),format.raw/*22.12*/("""<td><img src="/assets/images/projectImages"""),_display_(/*22.55*/(i.getId + " thumb.jpg")),format.raw/*22.79*/("""" /></td>
			        """)))}/*23.14*/else/*23.19*/{_display_(Seq[Any](format.raw/*23.20*/("""
			        """),format.raw/*24.12*/("""<td><img src="/assets/images/projectImages/noImage.jpg" /></td>
			        """)))}),format.raw/*25.13*/("""

				    """),format.raw/*27.9*/("""<td>"""),_display_(/*27.14*/i/*27.15*/.getId),format.raw/*27.21*/("""</td>
				    <td>"""),_display_(/*28.14*/i/*28.15*/.getNumBeds),format.raw/*28.26*/("""</td>
				    <td>"""),_display_(/*29.14*/i/*29.15*/.getNumBaths),format.raw/*29.27*/("""</td>
				    <td>&euro; """),_display_(/*30.21*/("%.2f".format(i.getPrice))),format.raw/*30.48*/("""</td>
				    <td>"""),_display_(/*31.14*/i/*31.15*/.getGardenSize),format.raw/*31.29*/("""</td>
				</tr>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>         
""")))}),format.raw/*36.2*/(""" """))
      }
    }
  }

  def render(results:List[models.Houses],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(results,user,env)

  def f:((List[models.Houses],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (results,user,env) => apply(results,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/searchQuery.scala.html
                  HASH: 4d222aba71fdf0c35f2f06caa5e2b5776a594cd5
                  MATRIX: 1006->1|1182->84|1209->86|1237->106|1276->108|1307->113|1747->526|1778->541|1818->543|1850->548|1894->565|1984->646|2024->648|2064->660|2134->703|2179->727|2220->750|2233->755|2272->756|2312->768|2419->844|2456->854|2488->859|2498->860|2525->866|2571->885|2581->886|2613->897|2659->916|2669->917|2702->929|2755->955|2803->982|2849->1001|2859->1002|2894->1016|2954->1045|2990->1054|3052->1086
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|62->31|62->31|62->31|64->33|65->34|67->36
                  -- GENERATED --
              */
          