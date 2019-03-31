
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display errors -->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),format.raw/*10.17*/("""e.message<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.55*/("""
    """),_display_(/*15.6*/if(flash.containsKey("error"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
        """),format.raw/*16.9*/("""<div class="alert alert-success">
            """),_display_(/*17.14*/flash/*17.19*/.get("error")),format.raw/*17.32*/("""
        """),format.raw/*18.9*/("""</div>
    """)))}),format.raw/*19.6*/("""

    """),format.raw/*21.5*/("""<!-- Displaying the form itself -->
    """),_display_(/*22.6*/helper/*22.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*22.76*/ {_display_(Seq[Any](format.raw/*22.78*/("""
        """),format.raw/*23.37*/("""
        """),_display_(/*24.10*/CSRF/*24.14*/.formField),format.raw/*24.24*/("""

        """),format.raw/*26.9*/("""<div class="form-group">
            """),_display_(/*27.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*28.72*/("""
        """),format.raw/*29.9*/("""</div>
        <div class="form-group">
            """),_display_(/*31.14*/inputPassword(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.75*/("""
        """),format.raw/*33.9*/("""</div>

        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>

    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""


    """),format.raw/*42.5*/("""<p>
        <a href=""""),_display_(/*43.19*/routes/*43.25*/.HomeController.createAccount()),format.raw/*43.56*/("""">
            <button class="btn btn-primary">Create Account</button>
        </a>
    </p>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/login.scala.html
                  HASH: f6d139355a344380869f1e8d97b4f638435860f0
                  MATRIX: 984->1|1119->65|1163->82|1190->84|1217->103|1256->105|1287->110|1362->160|1399->189|1438->191|1473->200|1544->245|1591->277|1630->279|1675->296|1734->324|1770->333|1810->343|1843->398|1875->404|1914->434|1954->436|1990->445|2064->492|2078->497|2112->510|2148->519|2190->531|2223->537|2290->578|2305->584|2378->648|2418->650|2455->687|2492->697|2505->701|2536->711|2573->721|2638->759|2775->875|2811->884|2891->937|3038->1063|3074->1072|3240->1208|3269->1226|3303->1233|3352->1255|3367->1261|3419->1292
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|53->22|53->22|53->22|53->22|54->23|55->24|55->24|55->24|57->26|58->27|59->28|60->29|62->31|63->32|64->33|70->39|70->39|73->42|74->43|74->43|74->43
                  -- GENERATED --
              */
          