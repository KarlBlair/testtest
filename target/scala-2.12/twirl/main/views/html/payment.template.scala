
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

object payment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Payment", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
		"""),format.raw/*3.3*/("""<div class="container-fluid">
			<div class="col-sm-3">
				<div id="search-form">
					<span class="title">Search Properties</span>
					
					Area<br>
					<select>
						<option value="dublin1">Dublin 1</option>
						<option value="dublin2">Dublin 2</option>
						<option value="dublin3">Dublin 3</option>
						<option value="dublin4">Dublin 4</option>
						<option value="dublin5">Dublin 5</option>
						<option value="dublin6">Dublin 6</option>
						<option value="dublin7">Dublin 7</option>
						<option value="dublin8">Dublin 8</option>
						<option value="dublin9">Dublin 9</option>
						<option value="dublin10">Dublin 10</option>
						<option value="dublin11">Dublin 11</option>
						<option value="dublin12">Dublin 12</option>
						<option value="dublin13">Dublin 13</option>
						<option value="dublin14">Dublin 14</option>
						<option value="dublin15">Dublin 15</option>
						<option value="dublin16">Dublin 16</option>
						<option value="dublin17">Dublin 17</option>
						<option value="dublin18">Dublin 18</option>
						<option value="dublin19">Dublin 19</option>
						<option value="dublin20">Dublin 20</option>
						<option value="dublin21">Dublin 21</option>
						<option value="dublin22">Dublin 22</option>
						<option value="dublin23">Dublin 23</option>
						<option value="dublin24">Dublin 24</option>
					</select>
					<br><br>
					Minimum Price<br>
					€ <input type="text" placeholder="Enter minimum price here" />
					
					<br><br>
					Maximum Price<br>
					€ <input type="text" placeholder="Enter minimum price here" />
					
					<br><br>
					<input type="submit" />
				</div>
			</div>
			<div class="col-sm-6">
				<div id="slide-show">
					<img src="http://www.bmccormackconstruction.ie/wp-content/uploads/2017/10/dsc9892-350x350.jpg" alt="Slideshow" />
					<div class="title">Property in AreaName</div>
					<div class="property-text">hhhhhh</div>
					zz
				</div>
				<div> 
					<form action="/charge" method="POST">
						<script
						  src="https://checkout.stripe.com/checkout.js"
						  class="stripe-button"
						  data-key="pk_test_6pRNASCoBOKtIshFeQd4XMUh"
						  data-image="/square-image.png"
						  data-name="Deposit"
						  data-description="Deposit ($600.00)"
						  data-amount="60000">
						</script>
					  </form>
					  
				</div>
			</div>
			<div class="col-sm-3">
				<div id="search-form">
					zzzzz
				</div>
			</div>
		</div>
	""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 31 18:21:17 CEST 2019
                  SOURCE: /home/wdd/college2/PlayReminder/app/views/payment.scala.html
                  HASH: 3038db28e2d13332184f08492f261eb7756506f1
                  MATRIX: 961->1|1080->28|1109->49|1147->50|1176->53
                  LINES: 28->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          