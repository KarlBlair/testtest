
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

object setupRent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.users.Member],Form[models.rent.RentDue],Form[models.Property],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mForm: Form[models.users.Member], rForm: Form[models.rent.RentDue], pForm: Form[models.Property], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Rent setup", user)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""

""")))}))
      }
    }
  }

  def render(mForm:Form[models.users.Member],rForm:Form[models.rent.RentDue],pForm:Form[models.Property],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(mForm,rForm,pForm,user)

  def f:((Form[models.users.Member],Form[models.rent.RentDue],Form[models.Property],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (mForm,rForm,pForm,user) => apply(mForm,rForm,pForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:18 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/setupRent.scala.html
                  HASH: c86cb69aa2e01e9fbea06d59b4308bab1afdec1e
                  MATRIX: 1037->1|1233->127|1277->125|1304->143|1331->145|1363->169|1402->171
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5
                  -- GENERATED --
              */
          