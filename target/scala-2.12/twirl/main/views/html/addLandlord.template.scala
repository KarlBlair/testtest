
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

object addLandlord extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Landlord],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lForm: Form[models.users.Landlord], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add a Landlord", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new Landlord</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addLandlordSubmit, 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),format.raw/*13.9*/("""<!-- Uses helper methods to take the values from the form and add it to the database -->
        <!-- No need to get the id because it's auto generated -->
        """),_display_(/*15.10*/inputText(lForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.81*/("""
        """),_display_(/*16.10*/inputText(lForm("fname"), '_label -> "First Name", 'class -> "form-control")),format.raw/*16.86*/("""
        """),_display_(/*17.10*/inputText(lForm("lname"), '_label -> "Last Name", 'class -> "form-control")),format.raw/*17.85*/("""
        """),_display_(/*18.10*/inputText(lForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*18.87*/("""

        """),_display_(/*20.10*/inputText(lForm("role").copy(value=Some("landlord")), '_label -> "", 'hidden -> "hidden")),format.raw/*20.99*/("""

        """),format.raw/*22.9*/("""<label> Image Upload </label>
        <input class="btn-sm btn-default" type="file" name="upload">
    
        <div class="actions">
            <input type="submit" value="Add Landlord" class="btn btn-primary">
            <a href=""""),_display_(/*27.23*/routes/*27.29*/.HomeController.landlord()),format.raw/*27.55*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*31.6*/("""
""")))}))
      }
    }
  }

  def render(lForm:Form[models.users.Landlord],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(lForm,user,env)

  def f:((Form[models.users.Landlord],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (lForm,user,env) => apply(lForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:17 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/addLandlord.scala.html
                  HASH: 1e4115920dc4d9abe1d1eb7ffc6a4466d5e93141
                  MATRIX: 1014->1|1175->92|1219->90|1246->109|1273->111|1309->139|1348->141|1379->146|1449->191|1613->347|1652->349|1689->386|1726->396|1739->400|1770->410|1807->420|1999->585|2091->656|2128->666|2225->742|2262->752|2358->827|2395->837|2493->914|2531->925|2641->1014|2678->1024|2940->1259|2955->1265|3002->1291|3150->1409
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|41->10|42->11|42->11|42->11|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|53->22|58->27|58->27|58->27|62->31
                  -- GENERATED --
              */
          