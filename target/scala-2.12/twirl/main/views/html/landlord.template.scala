
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

object landlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Landlord],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(landList: List[models.users.Landlord], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Landlord",user)/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<h1>Current LandLords</h1>

<!-- Displays the flash message -->
"""),_display_(/*6.2*/if(flash.containsKey("success"))/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
"""),format.raw/*7.1*/("""<div class="alert alert-success">
    """),_display_(/*8.6*/flash/*8.11*/.get("success")),format.raw/*8.26*/("""
"""),format.raw/*9.1*/("""</div>
""")))}),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""<div class="col-sm-9">
    <h4>Here are all the current LandLords on the system.</h4>
    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!-- The header row -->
            <tr>
                <th>Image</th>
                <th>Email</th>
                <th>Role</th>
                <th>Name</th>
                <th>Password</th>
            </tr>
        </thead>

        <tbody>
            <!-- Product row(s) -->

            <!-- Loop for creating rows from the users data -->
            """),_display_(/*30.14*/for(u<-landList) yield /*30.30*/ {_display_(Seq[Any](format.raw/*30.32*/(""" """),format.raw/*30.33*/("""<tr>

                """),_display_(/*32.18*/if(env.resource("public/images/workerImages/" + u.getEmail + "thumb.jpg").isDefined)/*32.102*/ {_display_(Seq[Any](format.raw/*32.104*/("""
                """),format.raw/*33.17*/("""<td><img src="/assets/images/projectImages"""),_display_(/*33.60*/(u.getEmail + " thumb.jpg")),format.raw/*33.87*/("""" /></td>
                """)))}/*34.19*/else/*34.24*/{_display_(Seq[Any](format.raw/*34.25*/("""
                """),format.raw/*35.17*/("""<td><img src="/assets/images/projectImages/noImage.jpg" /></td>
                """)))}),format.raw/*36.18*/("""

                """),format.raw/*38.17*/("""<td>"""),_display_(/*38.22*/u/*38.23*/.getEmail),format.raw/*38.32*/("""</td>
                <td>"""),_display_(/*39.22*/u/*39.23*/.getRole),format.raw/*39.31*/("""</td>
                <td>"""),_display_(/*40.22*/u/*40.23*/.getFname),format.raw/*40.32*/("""</td>
                <td>"""),_display_(/*41.22*/u/*41.23*/.getPassword),format.raw/*41.35*/("""</td>
                </tr>
                """)))}),format.raw/*43.18*/("""
        """),format.raw/*44.9*/("""</tbody>
    </table>
    <p>
        <a href=""""),_display_(/*47.19*/routes/*47.25*/.HomeController.addLandlord()),format.raw/*47.54*/("""">
            <button class="btn btn-primary">Add a new Administrator</button>
        </a>
    </p>
</div>







""")))}))
      }
    }
  }

  def render(landList:List[models.users.Landlord],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(landList,user,env)

  def f:((List[models.users.Landlord],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (landList,user,env) => apply(landList,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/landlord.scala.html
                  HASH: e83284353b2ddfb0eb9a184e03cbcd9923f03321
                  MATRIX: 1011->1|1196->94|1225->115|1264->117|1291->118|1381->183|1421->215|1460->217|1487->218|1551->257|1564->262|1599->277|1626->278|1664->286|1693->288|2266->834|2298->850|2338->852|2367->853|2417->876|2511->960|2552->962|2597->979|2667->1022|2715->1049|2761->1077|2774->1082|2813->1083|2858->1100|2970->1181|3016->1199|3048->1204|3058->1205|3088->1214|3142->1241|3152->1242|3181->1250|3235->1277|3245->1278|3275->1287|3329->1314|3339->1315|3372->1327|3448->1372|3484->1381|3559->1429|3574->1435|3624->1464
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|61->30|61->30|61->30|61->30|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|67->36|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|74->43|75->44|78->47|78->47|78->47
                  -- GENERATED --
              */
          