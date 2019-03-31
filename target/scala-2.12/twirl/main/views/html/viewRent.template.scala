
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

object viewRent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.rent.RentDue],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(RentDue: List[models.rent.RentDue], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("RentDue",user)/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1>Rent</h1>
""")))}))
      }
    }
  }

  def render(RentDue:List[models.rent.RentDue],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(RentDue,user)

  def f:((List[models.rent.RentDue],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (RentDue,user) => apply(RentDue,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/viewRent.scala.html
                  HASH: 1b9dbab0d89140bf3d7431f87507b651a74e94c4
                  MATRIX: 988->1|1143->64|1171->84|1210->86|1237->87
                  LINES: 28->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          