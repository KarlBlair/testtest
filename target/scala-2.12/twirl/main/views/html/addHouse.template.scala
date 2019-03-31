
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

object addHouse extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Houses],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(houseForm: Form[models.Houses], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add House", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addHouseSubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*15.10*/inputText(houseForm("numBeds"), '_label -> "Bedrooms", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/inputText(houseForm("numBaths"), '_label -> "Bathrooms", 'class -> "form-control")),format.raw/*16.92*/("""
        """),_display_(/*17.10*/inputText(houseForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*17.85*/("""
        """),_display_(/*18.10*/inputText(houseForm("gardenSize"), '_label -> "Garden Size", 'class -> "form-control")),format.raw/*18.96*/("""
        """),_display_(/*19.10*/inputText(houseForm("garage"), '_label -> "Garage", 'class -> "form-control")),format.raw/*19.87*/("""

        """),format.raw/*21.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        """),_display_(/*24.10*/inputText(houseForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.72*/("""
    
        """),format.raw/*26.9*/("""<div class="actions">
            <input type="submit" value="Add house" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.database()),format.raw/*28.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*32.6*/("""
""")))}))
      }
    }
  }

  def render(houseForm:Form[models.Houses],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(houseForm,user,env)

  def f:((Form[models.Houses],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (houseForm,user,env) => apply(houseForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/addHouse.scala.html
                  HASH: 5ed72a43599168f7ca94ccad39480897d99a14f5
                  MATRIX: 1003->1|1160->88|1204->86|1231->105|1258->107|1289->130|1328->132|1359->137|1425->178|1586->331|1625->333|1662->370|1699->380|1712->384|1743->394|1780->404|1972->569|2073->649|2110->659|2213->741|2250->751|2346->826|2383->836|2490->922|2527->932|2625->1009|2662->1019|2802->1132|2885->1194|2926->1208|3073->1328|3088->1334|3135->1360|3283->1478
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|52->21|55->24|55->24|57->26|59->28|59->28|59->28|63->32
                  -- GENERATED --
              */
          